package be.kokw.restclient.implementations;

import be.kokw.restclient.entities.Reserve;
import be.kokw.restclient.services.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Component
public class ReserveServiceImplementation implements ReserveService {
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
    public Reserve reserveBook(String firstName, String lastName, String title, LocalDate pickupDate) {
        return template.getForObject(baseUrl + "/books/{firstName}/{lastName}/{title}/{pickupDate}", Reserve.class, firstName, lastName, title, pickupDate);
    }

    @Override
    public Reserve reserveDigital(String firstName, String lastName, String title, LocalDate pickupDate) {
        return template.getForObject(baseUrl + "/digitals/{firstName}/{lastName}/{title}/{pickupDate}", Reserve.class, firstName, lastName, title, pickupDate);
    }
}
