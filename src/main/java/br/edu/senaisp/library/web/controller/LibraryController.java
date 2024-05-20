package br.edu.senaisp.library.web.controller;


import br.edu.senaisp.library.Service.LibraryService;
import br.edu.senaisp.library.model.Library;
import br.edu.senaisp.library.web.dto.CreateBookDto;
import br.edu.senaisp.library.web.dto.ResponseBookDto;
import br.edu.senaisp.library.web.dto.UpdateBookDto;
import br.edu.senaisp.library.web.dto.mapper.BookMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping
    public ResponseEntity<ResponseBookDto> createBook(@RequestBody CreateBookDto createBookDto){
        Library library = libraryService.createBook(BookMapper.toLibrary(createBookDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(BookMapper.toDto(library));
    }

    @GetMapping
    public ResponseEntity<List<ResponseBookDto>> listBooks(){
         List<Library> libraries = libraryService.listBooks();
        return ResponseEntity.ok(BookMapper.toListDto(libraries));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseBookDto> findBookById(@PathVariable int id){
        Library library = libraryService.findBookById(id);
        return ResponseEntity.ok(BookMapper.toDto(library));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseBookDto> update(@PathVariable int id, @RequestBody UpdateBookDto dto){
        Library library = libraryService.updateBook(id, dto.getTitle(), dto.getConfirmTitle(), dto.getAuthor(), dto.getPublished_date());
        return ResponseEntity.ok(BookMapper.toDto(library));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBooks(@PathVariable int id){
        libraryService.deleteBook(id);
        return null;
    }
}
