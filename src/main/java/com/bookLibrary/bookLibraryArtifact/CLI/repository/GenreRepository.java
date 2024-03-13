package com.bookLibrary.bookLibraryArtifact.CLI.repository;

import com.bookLibrary.bookLibraryArtifact.entity.Genre;
import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Long> {

}
