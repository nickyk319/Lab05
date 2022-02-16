package com.example.soap.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerPOJO {

    protected String id;
    protected String name;
    public Address address;

    public CustomerPOJO(String id, String name, String buildingAndStreet, String city, String zip) {
        this.id = id;
        this.name = name;
        this.address = new Address();
        address.setBuildingAndStreet(buildingAndStreet);
        address.setCity(city);
        address.setZip(zip);
    }

    public CustomerPOJO(String name, String buildingAndStreet, String city, String zip) {
        this.name = name;
        this.address = new Address();
        address.setBuildingAndStreet(buildingAndStreet);
        address.setCity(city);
        address.setZip(zip);
    }

    public CustomerPOJO(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuildingAndStreet() {
        return this.address.buildingAndStreet;
    }

    public String getCity() {
        return this.address.city;
    }

    public String getZip() {
        return this.address.zip;
    }

    public String getAddress(){
        return getBuildingAndStreet() + getCity() + getZip();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}


