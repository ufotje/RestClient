package be.kokw.restclient.services;

import be.kokw.restclient.entities.Digital;

import java.util.List;

public interface DigitalService {
    List<Digital> findDigitalByTopic(String topic);
    List<Digital> findDigitalByAuthor(String author);
    Digital findDigitalByTitle(String title);
}
