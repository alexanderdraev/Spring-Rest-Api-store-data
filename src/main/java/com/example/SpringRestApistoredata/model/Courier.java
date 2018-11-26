package com.example.SpringRestApistoredata.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Courier {

    private String name;
    private String phoneNumber;
    private String carRegistration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", carRegistration='" + carRegistration + '\'' +
                '}';
    }
}
