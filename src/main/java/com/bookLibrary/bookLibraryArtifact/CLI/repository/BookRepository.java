package com.bookLibrary.bookLibraryArtifact.CLI.repository;

import org.springframework.data.repository.CrudRepository;
import com.bookLibrary.bookLibraryArtifact.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
