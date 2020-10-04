package com.erensayar.service;

import com.erensayar.entity.Author;
import com.erensayar.entity.Book;

import java.util.List;
import java.util.Optional;

/**
 * @author ErenSayar
 */
public interface IAuthorService {

    void addAuthor(Author author);

    void deleteAuthorById(Integer id);

    List<Author> getAllAuthor();

    Optional<Author> getAuthorById(Integer id);

    void updateAuthor(Author authorToUpd);

    List<Book> findByName(String author);

}
