package com.bookLibrary.bookLibraryArtifact.persistence.repository;

import com.bookLibrary.bookLibraryArtifact.persistence.entity.OrderOnline;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderOnlineRepository extends CrudRepository<OrderOnline, Long> {

}
