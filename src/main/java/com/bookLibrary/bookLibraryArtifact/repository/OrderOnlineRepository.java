package com.bookLibrary.bookLibraryArtifact.repository;

import com.bookLibrary.bookLibraryArtifact.entity.OrderOnline;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderOnlineRepository extends CrudRepository<OrderOnline, Long> {

}
