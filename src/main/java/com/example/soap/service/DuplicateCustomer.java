package com.example.soap.service;

import javax.xml.ws.WebFault;
import java.lang.Exception;

@WebFault(name = "DuplicateCustomer", targetNamespace="http://www.soen487.com/lab05")
public class DuplicateCustomer extends Exception{
    public DuplicateCustomer(){
        super("Duplicate customer!");
    }
}
