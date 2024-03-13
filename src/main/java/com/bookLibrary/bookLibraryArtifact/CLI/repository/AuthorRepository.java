package com.bookLibrary.bookLibraryArtifact.CLI.repository;

import com.bookLibrary.bookLibraryArtifact.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
