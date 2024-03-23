package com.bookLibrary.bookLibraryArtifact.repository;

import com.bookLibrary.bookLibraryArtifact.entity.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Long> {

}
