package be.kokw.restclient.services;

import be.kokw.restclient.entities.Books;

import java.util.List;

public interface BookService {
    List<Books> findBookByTopic(String topic);
    List<Books> findBookByAuthor(String author);
    Books findBookByTitle(String title);
}
