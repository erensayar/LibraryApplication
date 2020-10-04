package com.erensayar.repository;

import com.erensayar.entity.Author;
import com.erensayar.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ErenSayar
 */
@Repository
public interface AuthorRepo extends JpaRepository<Author, Integer> {

    List<Book> findByName(String author);

}
