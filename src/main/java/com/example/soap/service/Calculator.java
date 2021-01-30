package com.example.soap.service;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Interface for our Calculator web service
 */
@WebService
@SOAPBinding
public interface Calculator {
    @WebMethod
    String sayHelloWorld(String content);    
}
