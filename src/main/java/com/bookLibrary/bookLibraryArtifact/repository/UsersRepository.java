package com.bookLibrary.bookLibraryArtifact.repository;

import com.bookLibrary.bookLibraryArtifact.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {

}
