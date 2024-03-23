package com.bookLibrary.bookLibraryArtifact.persistence.repository;

import com.bookLibrary.bookLibraryArtifact.persistence.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
