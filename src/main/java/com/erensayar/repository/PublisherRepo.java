package com.erensayar.repository;

import com.erensayar.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ErenSayar
 */
@Repository
public interface PublisherRepo extends JpaRepository<Publisher, Integer> {
}
