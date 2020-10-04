package com.erensayar.service.implementation;

import com.erensayar.entity.Author;
import com.erensayar.entity.Book;
import com.erensayar.repository.AuthorRepo;
import com.erensayar.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ErenSayar
 */
@Service
public class AuthorService implements IAuthorService {

    //<=====================================================================>
    private AuthorRepo authorRepo;

    @Autowired // Constructor Injection
    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }//<=====================================================================>

    @Override
    public void addAuthor(Author author) {
        authorRepo.save(author);
    }

    @Override
    public void deleteAuthorById(Integer id) {
        authorRepo.deleteById(id);
    }

    @Override
    public List<Author> getAllAuthor() {
        return authorRepo.findAll();
    }

    @Override
    public Optional<Author> getAuthorById(Integer id) {
        return authorRepo.findById(id);
    }

    @Override
    public void updateAuthor(Author authorToUpd) {
        Author author = authorRepo.getOne(authorToUpd.getId());
        author.setName(authorToUpd.getName());
        author.setSurname(authorToUpd.getSurname());
        author.setBook(authorToUpd.getBook());
        author.setExplanation(authorToUpd.getExplanation());
        authorRepo.save(author);
    }

    //<=====================================================================>
    @Override
    public List<Book> findByName(String author) {
        return authorRepo.findByName(author);
    }
}
