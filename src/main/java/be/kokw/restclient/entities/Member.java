package be.kokw.restclient.entities;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Member {
    private long id;
    private String firstName;
    private String lastName;
    private String street;
    private String houseNr;
    private int zip;
    private String city;
    private String gender;
    private String eMail;
    private LocalDate bDay;

    public Member() {
    }

    public Member(String firstName, String lastName, String street, String houseNr, String zip, String city, String gender, String eMail, Date bDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.houseNr = houseNr;
        this.zip = Integer.parseInt(zip);
        this.city = city;
        this.gender = gender;
        this.eMail = eMail;
        this.bDay = bDay.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNr() {
        return houseNr;
    }

    public void setHouseNr(String houseNr) {
        this.houseNr = houseNr;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public LocalDate getbDay() {
        return bDay;
    }

    public void setbDay(LocalDate bDay) {
        this.bDay = bDay;
    }
}
