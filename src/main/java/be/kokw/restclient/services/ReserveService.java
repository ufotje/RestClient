package be.kokw.restclient.services;

import be.kokw.restclient.entities.Reserve;

import java.time.LocalDate;

public interface ReserveService {
    Reserve reserveBook(String firstName, String lastName, String title, LocalDate pickupDate);
    Reserve reserveDigital(String firstName, String lastName, String title, LocalDate pickupDate);
}
