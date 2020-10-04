package com.erensayar.repository;

import com.erensayar.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ErenSayar
 */
@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

    Book findByName(String bookName);

    List<Book> findBySerialName(String serialName);

    Book findByIsbnNo(String isbnNo);
}
