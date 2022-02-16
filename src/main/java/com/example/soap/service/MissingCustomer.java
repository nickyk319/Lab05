package com.example.soap.service;

import javax.xml.ws.WebFault;
import java.lang.Exception;

@WebFault(name = "MissCustomer", targetNamespace="http://www.soen487.com/lab05")
public class MissingCustomer extends Exception{
    public MissingCustomer() {
        super("No customer found!");
    }

}
