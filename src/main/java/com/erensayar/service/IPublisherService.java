package com.erensayar.service;

import com.erensayar.entity.Publisher;

import java.util.List;
import java.util.Optional;

/**
 * @author ErenSayar
 */
public interface IPublisherService {

    void addPublisher(Publisher publisher);

    void deletePublisherById(Integer id);

    List<Publisher> getAllPublisher();

    Optional<Publisher> getPublisherById(Integer id);

    void updatePublisher(Publisher publisherToUpd);
}
