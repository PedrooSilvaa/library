package br.edu.senaisp.library.Service;

import br.edu.senaisp.library.exception.BookNotFoundException;
import br.edu.senaisp.library.exception.BookUniqueViolationException;
import br.edu.senaisp.library.exception.DataInvalidException;
import br.edu.senaisp.library.model.Library;
import br.edu.senaisp.library.repository.ILibraryRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LibraryService {

    private final ILibraryRepository libraryRepository;

    public LibraryService(ILibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
        }

    @Transactional
    public Library createBook(Library library){
        try {
        return libraryRepository.save(library);
        }catch (DataIntegrityViolationException ex){
            throw new BookUniqueViolationException(String.format("Book %s already registered", library.getTitle()));
        }
    }

    @Transactional(readOnly = true)
    public List<Library> listBooks(){
            return libraryRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Library findBookById(int id){
            return libraryRepository.findById(id).orElseThrow(
                    () -> new BookNotFoundException(String.format("Book id = %s not found", id))
            );
    }

    @Transactional(readOnly = true)
    public Library findBookByTitle(String title){
            return libraryRepository.findByTitle(title).orElseThrow(
                    () -> new BookNotFoundException(String.format("Book id = %s not found", title))
            );
    }

    @Transactional
    public Library updateBook(int id, String title, String confirmTitle, String author, String published_date){
        if(!confirmTitle.equals(title)){
            throw new DataInvalidException("Title does not match");
        }
        Library library = findBookById(id);

        library.setTitle(title);
        library.setAuthor(author);
        library.setPublished_date(published_date);

        return library;
    }

    @Transactional
    public void deleteBook(int id){
        libraryRepository.deleteById(id);
    }
}
