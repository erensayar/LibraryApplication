package com.erensayar.controller;

import com.erensayar.entity.Author;
import com.erensayar.entity.Book;
import com.erensayar.entity.Publisher;
import com.erensayar.service.IAuthorService;
import com.erensayar.service.IBookService;
import com.erensayar.service.IPublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author ErenSayar
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    private IAuthorService authorService;
    private IBookService bookService;
    private IPublisherService publisherService;

    @Autowired // Constructor Injection
    public ApiController(IAuthorService authorService, IBookService bookService, IPublisherService publisherService) {
        this.authorService = authorService;
        this.bookService = bookService;
        this.publisherService = publisherService;
    }

    // GetById
    //<=====================================================================>
    @GetMapping(value = "/get/getAuthorById/{id}")
    public Optional<Author> getAuthorById(@PathVariable("id") Integer id) {
        return authorService.getAuthorById(id);
    }

    @GetMapping(value = "/get/getBookById/{id}")
    public Optional<Book> getBookById(@PathVariable("id") Integer id) {
        return bookService.getBookById(id);
    }

    @GetMapping(value = "/get/getPublisherById/{id}")
    public Optional<Publisher> getPublisherById(@PathVariable("id") Integer id) {
        return publisherService.getPublisherById(id);
    }

    // GetAll
    //<=====================================================================>
    @GetMapping(value = "/get/getAllAuthor")
    public List<Author> getAllAuthor() {
        return authorService.getAllAuthor();
    }

    @GetMapping(value = "/get/getAllBook")
    public List<Book> getAllBook() {
        return bookService.getAllBook();
    }

    @GetMapping(value = "/get/getAllPublisher")
    public List<Publisher> getAllPublisher() {
        return publisherService.getAllPublisher();
    }

    // DeleteById
    //<=====================================================================>
    @PostMapping(value = "/admin/deleteAuthor")
    public ResponseEntity<String> deleteAuthor(@RequestBody Author author) {
        authorService.deleteAuthorById(author.getId());
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }

    @PostMapping(value = "/admin/deleteBook")
    public ResponseEntity<String> deleteBook(@RequestBody Book book) {
        bookService.deleteBookById(book.getId());
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }

    @PostMapping(value = "/admin/deletePublisher")
    public ResponseEntity<String> deletePublisher(@RequestBody Publisher publisher) {
        publisherService.deletePublisherById(publisher.getId());
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }

    // Add
    //<=====================================================================>
    @PostMapping(value = "/admin/addAuthor")
    public ResponseEntity<String> addAuthor(@RequestBody Author author) {
        authorService.addAuthor(author);
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }

    @PostMapping(value = "/admin/addBook")
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }

    @PostMapping(value = "/admin/addPublisher")
    public ResponseEntity<String> addPublisher(@RequestBody Publisher publisher) {
        publisherService.addPublisher(publisher);
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }

    // Update
    //<=====================================================================>
    @PostMapping(value = "/admin/updateAuthor")
    public ResponseEntity<String> updateAuthor(@RequestBody Author author) {
        authorService.updateAuthor(author);
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }

    @PostMapping(value = "/admin/updateBook")
    public ResponseEntity<String> updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }

    @PostMapping(value = "/admin/updatePublisher")
    public ResponseEntity<String> updatePublisher(@RequestBody Publisher publisher) {
        publisherService.updatePublisher(publisher);
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }

    // FindBy<Special>
    //<=====================================================================>
    @GetMapping(value = "/get/getBookByAuthorName/{authorName}")
    public List<Book> getBookByAuthorName(@PathVariable("authorName") String authorName) {
        return authorService.findByName(authorName);
    }

    @GetMapping(value = "/get/findByBookName/{bookName}")
    public Book findByBookName(@PathVariable("bookName") String bookName) {
        return bookService.findByName(bookName);
    }

    @GetMapping(value = "/get/findByBookSerialName/{serialName}")
    public List<Book> findByBookSerialName(@PathVariable("serialName") String serialName) {
        return bookService.findBySerialName(serialName);
    }

    @GetMapping(value = "/get/findByIsbnNo/{isbnNo}")
    public Book findByIsbnNo(@PathVariable("isbnNo") String isbnNo) {
        return bookService.findByIsbnNo(isbnNo);
    }


}
