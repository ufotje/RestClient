package be.kokw.restclient.implementations;


import be.kokw.restclient.entities.Books;
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
    public List<Books> findBookByTopic(String topic) {
        ResponseEntity<Books[]> response = template.getForEntity(baseUrl + "/books/search/topic/" + topic, Books[].class);
        return Arrays.asList(response.getBody());
    }

    @Override
    public List<Books> findAllBooks() {
        ResponseEntity<Books[]> responseEntity = template.getForEntity(baseUrl + "/books/search/all", Books[].class);
        return Arrays.asList(responseEntity.getBody());
    }

    @Override
    public List<Books> findBookByAuthor(String author){
        ResponseEntity<Books[]> response = template.getForEntity(baseUrl + "/books/search/author/" + author, Books[].class);
        return Arrays.asList(response.getBody());
    }

    @Override
    public List<Books> findBookByTitle(String title) {
        ResponseEntity<Books[]> response = template.getForEntity(baseUrl + "/books/search/title/" + title, Books[].class);
        return Arrays.asList(response.getBody());
    }

    @Override
    public Books findBookByTitleAndVolume(String title, int volume) {
        return template.getForObject(baseUrl + "/books/search/title/" + title + "/" + volume, Books.class, title, volume);
    }
}
