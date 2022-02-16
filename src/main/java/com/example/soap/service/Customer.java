package com.example.soap.service;

import com.example.soap.service.CustomerPOJO;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.soap.SOAPException;
import java.io.IOException;
import java.util.List;

/**
 * Interface for our Calculator web service
 */
@WebService(targetNamespace="http://www.soen487.com/lab05")
@SOAPBinding
public interface Customer {
    @WebMethod
    String sayHelloWorld(String content);

    @WebMethod(operationName = "getAllCustomer")
    List<String> getAllCustomer();

    @WebMethod(operationName = "getCustomer")
    String getCustomer(@WebParam(name = "id") String id) throws MissingCustomer;

    @WebMethod(operationName = "addCustomer")
    void addCustomer(@WebParam(name = "id") String id, @WebParam(name = "name") String name, @WebParam(name = "buildingAndStreet") String buildingAndStreet, @WebParam(name = "city") String city, @WebParam(name = "zip") String zip) throws DuplicateCustomer;

    @WebMethod(operationName = "updateCustomer")
    void updateCustomer(@WebParam(name ="id") String id, @WebParam(name = "name") String name, @WebParam(name="buildingAndStreet") String buildingAndStreet, @WebParam(name = "city") String city, @WebParam(name = "zip") String zip) throws MissingCustomer;

    @WebMethod(operationName = "deleteCustomer")
    void deleteCustomer(@WebParam(name ="id") String id) throws MissingCustomer;

    @WebMethod(operationName = "downloadImage")
    DataHandler downloadImage();
}
