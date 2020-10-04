package com.erensayar.service;

import com.erensayar.entity.Book;

import java.util.List;
import java.util.Optional;

/**
 * @author ErenSayar
 */
public interface IBookService {

    void addBook(Book book);

    void deleteBookById(Integer id);

    List<Book> getAllBook();

    Optional<Book> getBookById(Integer id);

    void updateBook(Book bookToUpd);

    Book findByName(String bookName);

    List<Book> findBySerialName(String serialName);

    Book findByIsbnNo(String isbnNo);

}
