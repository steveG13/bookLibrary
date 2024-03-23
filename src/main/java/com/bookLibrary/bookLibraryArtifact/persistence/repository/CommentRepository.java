package com.bookLibrary.bookLibraryArtifact.persistence.repository;

import com.bookLibrary.bookLibraryArtifact.persistence.entity.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

}
