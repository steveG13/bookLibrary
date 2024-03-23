package com.bookLibrary.bookLibraryArtifact.repository;

import com.bookLibrary.bookLibraryArtifact.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
