package com.lamell.karin_ind_webservices.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
//@Table(name="addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    // @Column(length = 45)
    private String street;
    //@Column(length = 5)
    private String postalCode;
    //@Column(length = 30)
    private String city;
    //@Column(length = 20)
    private String country;

    //@OneToMany(mappedBy = "address", cascade = CascadeType.ALL) - Av någon anledning fungerar dessa rader inte i detta program.
    //private List<Member> member;

    public Address() {
    }

    public Address(int addressId, String street, String postalCode, String city, String country) {
        this.addressId = addressId;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
