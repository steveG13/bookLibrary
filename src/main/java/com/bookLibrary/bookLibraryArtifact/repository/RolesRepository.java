package com.bookLibrary.bookLibraryArtifact.repository;

import com.bookLibrary.bookLibraryArtifact.entity.Roles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends CrudRepository<Roles, Long> {

}
