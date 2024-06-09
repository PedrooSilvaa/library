package br.edu.senaisp.library.repository;

import br.edu.senaisp.library.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ILibraryRepository extends JpaRepository<Library, Integer> {

    Optional<Library>  findByTitle(String title);

 }

