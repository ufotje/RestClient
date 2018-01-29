package be.kokw.restclient.implementations;


import be.kokw.restclient.entities.Book;
import be.kokw.restclient.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class BookServiceImplementation implements BookService {
    private String baseUrl;
    private RestTemplate template;

    @Value("${resource.server.socket}")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Autowired
    public void setTemplate(RestTemplate template) {
        this.template = template;
    }

    @Override
    public List<Book> findBookByTopic(String topic) {
        ResponseEntity<Book[]> response = template.getForEntity(baseUrl + "/books/search{topic}", Book[].class);
        return Arrays.asList(response.getBody());
    }

    @Override
    public List<Book> findBookByAuthor(String Author){
        ResponseEntity<Book[]> response = template.getForEntity(baseUrl + "/books/search{author}", Book[].class);
        return Arrays.asList(response.getBody());
    }

    @Override
    public Book findBookByTitle(String title) {
        return template.getForObject(baseUrl + "/books/search{title}", Book.class, title);
    }
}
