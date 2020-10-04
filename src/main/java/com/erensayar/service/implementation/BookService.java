package com.erensayar.service.implementation;

import com.erensayar.entity.Book;
import com.erensayar.repository.BookRepo;
import com.erensayar.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ErenSayar
 */
@Service
public class BookService implements IBookService {

    //<=====================================================================>
    private BookRepo bookRepo;

    @Autowired // Constructor Injection
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }//<=====================================================================>

    @Override
    public void addBook(Book book) {
        bookRepo.save(book);
    }

    @Override
    public void deleteBookById(Integer id) {
        bookRepo.deleteById(id);
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepo.findAll();
    }

    @Override
    public Optional<Book> getBookById(Integer id) {
        return bookRepo.findById(id);
    }

    @Override
    public void updateBook(Book bookToUpd){
        Book book = bookRepo.getOne(bookToUpd.getId());
        book.setName(bookToUpd.getName());
        book.setSubName(bookToUpd.getSubName());
        book.setIsbnNo(bookToUpd.getIsbnNo());
        book.setSerialName(bookToUpd.getSerialName());
        book.setPublisher(bookToUpd.getPublisher());
        book.setAuthor(bookToUpd.getAuthor());
        book.setExplanation(bookToUpd.getExplanation());
        bookRepo.save(book);
    }

    //<=====================================================================>
    @Override
    public Book findByName(String book) {
        return bookRepo.findByName(book);
    }

    @Override
    public List<Book> findBySerialName(String serialName) {
        return bookRepo.findBySerialName(serialName);
    }

    @Override
    public Book findByIsbnNo(String isbnNo) {
        return bookRepo.findByIsbnNo(isbnNo);
    }




}
