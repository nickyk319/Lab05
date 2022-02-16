package com.example.soap.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {
    protected String buildingAndStreet;
    protected String city;
    protected String zip;

    public void setBuildingAndStreet(String buildingAndStreet) {
        this.buildingAndStreet = buildingAndStreet;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "buildingAndStreet='" + buildingAndStreet + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
