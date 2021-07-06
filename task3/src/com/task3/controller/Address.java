package com.task3.controller;

public class Address {

    // Constructor
    String cityIndex;
    String city;
    String street;
    String homeNumber;
    String apartment;


    public Address(String cityIndex, String city, String street, String homeNumber, String apartment) {
        this.cityIndex = cityIndex;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "City index: " + cityIndex + '\n' +
                "City: " + city + '\n' +
                "Street: " + street + '\n' +
                "Home number: " + homeNumber + '\n' +
                "Apartment: " + apartment + '\n';
    }
}
