package be.kokw.restclient.implementations;

import be.kokw.restclient.entities.Books;
import be.kokw.restclient.entities.Member;
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
    public Reserve reserveBook(Member member, Books books, LocalDate pickupDate) {
        return template.getForObject(baseUrl + "/books/" + member.getFirstName() + " " + member.getLastName() + "/" + books.getTitle() + "/" + pickupDate, Reserve.class, member, books, pickupDate);
    }

    @Override
    public Reserve reserveDigital(String firstName, String lastName, String title, LocalDate pickupDate) {
        return template.getForObject(baseUrl + "/digitals/{firstName}/{lastName}/{title}/{pickupDate}", Reserve.class, firstName, lastName, title, pickupDate);
    }
}
