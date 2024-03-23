package com.bookLibrary.bookLibraryArtifact.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import com.bookLibrary.bookLibraryArtifact.persistence.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
