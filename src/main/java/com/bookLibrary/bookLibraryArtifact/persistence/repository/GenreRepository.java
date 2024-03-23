package com.bookLibrary.bookLibraryArtifact.persistence.repository;

import com.bookLibrary.bookLibraryArtifact.persistence.entity.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Long> {

}
