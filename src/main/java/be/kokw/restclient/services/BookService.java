package be.kokw.restclient.services;

import be.kokw.restclient.entities.Book;

import java.util.List;

public interface BookService {
    List<Book> findBookByTopic(String topic);
    List<Book> findBookByAuthor(String author);
    Book findBookByTitle(String title);
}
