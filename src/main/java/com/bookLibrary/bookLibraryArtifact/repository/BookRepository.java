package com.bookLibrary.bookLibraryArtifact.repository;

import org.springframework.data.repository.CrudRepository;
import com.bookLibrary.bookLibraryArtifact.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
