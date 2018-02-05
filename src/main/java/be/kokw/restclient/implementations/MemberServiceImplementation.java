package be.kokw.restclient.implementations;

import be.kokw.restclient.entities.Member;
import be.kokw.restclient.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MemberServiceImplementation implements MemberService {
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
    public Member addMember(Member member) {
        return template.getForObject(baseUrl + "members/register/" + member, Member.class, member);
    }

    @Override
    public Member findMemberByFirstNameAndLastName(String firstName, String lastName) {
        return template.getForObject(baseUrl + "members/register/" + firstName + lastName, Member.class, firstName, lastName);
    }
}
