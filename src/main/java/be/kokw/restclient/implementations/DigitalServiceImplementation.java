package be.kokw.restclient.implementations;


import be.kokw.restclient.entities.Digital;
import be.kokw.restclient.services.DigitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class DigitalServiceImplementation implements DigitalService {
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
    public List<Digital> findDigitalByTopic(String topic) {
        ResponseEntity<Digital[]> response = template.getForEntity(baseUrl + "/digitals/search{topic}", Digital[].class);
        return Arrays.asList(response.getBody());
    }

    @Override
    public List<Digital> findDigitalByAuthor(String author) {
        ResponseEntity<Digital[]> response = template.getForEntity(baseUrl + "/digitals/search{author}", Digital[].class);
        return Arrays.asList(response.getBody());
    }

    @Override
    public Digital findDigitalByTitle(String title) {
        return template.getForObject(baseUrl + "/digitals/search{title}", Digital.class, title);
    }
}
