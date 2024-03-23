package com.bookLibrary.bookLibraryArtifact.persistence.repository;

import com.bookLibrary.bookLibraryArtifact.persistence.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {

}
