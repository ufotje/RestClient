package be.kokw.restclient.services;

import be.kokw.restclient.entities.Books;

import java.util.List;

public interface BookService {
    List<Books> findBookByTopic(String topic);
    List<Books> findAllBooks();
    List<Books> findBookByAuthor(String author);
    List<Books> findBookByTitle(String title);
    Books findBookByTitleAndVolume(String title, int volume);
}
