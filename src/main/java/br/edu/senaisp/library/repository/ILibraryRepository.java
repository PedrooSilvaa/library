package br.edu.senaisp.library.repository;

import br.edu.senaisp.library.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILibraryRepository extends JpaRepository<Library, Integer> {
}
