package com.bookLibrary.bookLibraryArtifact.CLI.repository;

import com.bookLibrary.bookLibraryArtifact.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Long> {

}
