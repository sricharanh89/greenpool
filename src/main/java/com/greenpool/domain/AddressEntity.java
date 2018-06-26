package com.greenpool.domain;

import javax.persistence.*;

@Entity(name = "address")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false,unique = true)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name="latitude",nullable = false,unique = true)
    private String latitude;

    @Column(name="longitude",nullable = false,unique = true)
    private String longitude;

    @Column(name="home",nullable = false,unique = true)
    private String home;

    @Column(name="street",nullable = false,unique = true)
    private String street;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name="country",nullable = false,unique = true)
    private String country;


    @Column(name="state",nullable = false,unique = true)
    private String state;



}
