package com.erensayar.service.implementation;

import com.erensayar.entity.Publisher;
import com.erensayar.repository.PublisherRepo;
import com.erensayar.service.IPublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ErenSayar
 */
@Service
public class PublisherService implements IPublisherService {

    //<=====================================================================>
    private PublisherRepo publisherRepo;

    @Autowired // Constructor Injection
    public PublisherService(PublisherRepo publisherRepo) {
        this.publisherRepo = publisherRepo;
    }//<=====================================================================>


    @Override
    public void addPublisher(Publisher publisher) {
        publisherRepo.save(publisher);
    }

    @Override
    public void deletePublisherById(Integer id) {
        publisherRepo.deleteById(id);
    }

    @Override
    public List<Publisher> getAllPublisher() {
        return publisherRepo.findAll();
    }

    @Override
    public Optional<Publisher> getPublisherById(Integer id) {
        return publisherRepo.findById(id);
    }

    @Override
    public void updatePublisher(Publisher publisherToUpd) {
        Publisher publisher = publisherRepo.getOne(publisherToUpd.getId());
        publisher.setName(publisherToUpd.getName());
        publisher.setBook(publisherToUpd.getBook());
        publisher.setExplanation(publisherToUpd.getExplanation());
        publisherRepo.save(publisher);
    }
}
