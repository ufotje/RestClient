package be.kokw.restclient.services;

import be.kokw.restclient.entities.Books;
import be.kokw.restclient.entities.Member;
import be.kokw.restclient.entities.Reserve;

import java.time.LocalDate;

public interface ReserveService {
    Reserve reserveBook(Member member, Books books, LocalDate pickupDate);
    Reserve reserveDigital(String firstName, String lastName, String title, LocalDate pickupDate);
}
