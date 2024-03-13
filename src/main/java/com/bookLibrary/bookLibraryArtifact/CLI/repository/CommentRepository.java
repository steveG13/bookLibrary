package com.bookLibrary.bookLibraryArtifact.CLI.repository;

import com.bookLibrary.bookLibraryArtifact.entity.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
