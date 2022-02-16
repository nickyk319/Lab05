
package com.example.soap.client.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Customer", targetNamespace = "http://www.soen487.com/lab05")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Customer {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloWorld", targetNamespace = "http://www.soen487.com/lab05", className = "com.example.soap.client.service.SayHelloWorld")
    @ResponseWrapper(localName = "sayHelloWorldResponse", targetNamespace = "http://www.soen487.com/lab05", className = "com.example.soap.client.service.SayHelloWorldResponse")
    @Action(input = "http://www.soen487.com/lab05/Customer/sayHelloWorldRequest", output = "http://www.soen487.com/lab05/Customer/sayHelloWorldResponse")
    public String sayHelloWorld(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCustomer", targetNamespace = "http://www.soen487.com/lab05", className = "com.example.soap.client.service.GetAllCustomer")
    @ResponseWrapper(localName = "getAllCustomerResponse", targetNamespace = "http://www.soen487.com/lab05", className = "com.example.soap.client.service.GetAllCustomerResponse")
    @Action(input = "http://www.soen487.com/lab05/Customer/getAllCustomerRequest", output = "http://www.soen487.com/lab05/Customer/getAllCustomerResponse")
    public List<String> getAllCustomer();

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     * @throws MissingCustomer_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomer", targetNamespace = "http://www.soen487.com/lab05", className = "com.example.soap.client.service.GetCustomer")
    @ResponseWrapper(localName = "getCustomerResponse", targetNamespace = "http://www.soen487.com/lab05", className = "com.example.soap.client.service.GetCustomerResponse")
    @Action(input = "http://www.soen487.com/lab05/Customer/getCustomerRequest", output = "http://www.soen487.com/lab05/Customer/getCustomerResponse", fault = {
        @FaultAction(className = MissingCustomer_Exception.class, value = "http://www.soen487.com/lab05/Customer/getCustomer/Fault/MissingCustomer")
    })
    public String getCustomer(
        @WebParam(name = "id", targetNamespace = "")
        String id)
        throws MissingCustomer_Exception
    ;

    /**
     * 
     * @param zip
     * @param city
     * @param name
     * @param id
     * @param buildingAndStreet
     * @throws DuplicateCustomer_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "addCustomer", targetNamespace = "http://www.soen487.com/lab05", className = "com.example.soap.client.service.AddCustomer")
    @ResponseWrapper(localName = "addCustomerResponse", targetNamespace = "http://www.soen487.com/lab05", className = "com.example.soap.client.service.AddCustomerResponse")
    @Action(input = "http://www.soen487.com/lab05/Customer/addCustomerRequest", output = "http://www.soen487.com/lab05/Customer/addCustomerResponse", fault = {
        @FaultAction(className = DuplicateCustomer_Exception.class, value = "http://www.soen487.com/lab05/Customer/addCustomer/Fault/DuplicateCustomer")
    })
    public void addCustomer(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "buildingAndStreet", targetNamespace = "")
        String buildingAndStreet,
        @WebParam(name = "city", targetNamespace = "")
        String city,
        @WebParam(name = "zip", targetNamespace = "")
        String zip)
        throws DuplicateCustomer_Exception
    ;

    /**
     * 
     * @param zip
     * @param city
     * @param name
     * @param id
     * @param buildingAndStreet
     * @throws MissingCustomer_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateCustomer", targetNamespace = "http://www.soen487.com/lab05", className = "com.example.soap.client.service.UpdateCustomer")
    @ResponseWrapper(localName = "updateCustomerResponse", targetNamespace = "http://www.soen487.com/lab05", className = "com.example.soap.client.service.UpdateCustomerResponse")
    @Action(input = "http://www.soen487.com/lab05/Customer/updateCustomerRequest", output = "http://www.soen487.com/lab05/Customer/updateCustomerResponse", fault = {
        @FaultAction(className = MissingCustomer_Exception.class, value = "http://www.soen487.com/lab05/Customer/updateCustomer/Fault/MissingCustomer")
    })
    public void updateCustomer(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "buildingAndStreet", targetNamespace = "")
        String buildingAndStreet,
        @WebParam(name = "city", targetNamespace = "")
        String city,
        @WebParam(name = "zip", targetNamespace = "")
        String zip)
        throws MissingCustomer_Exception
    ;

    /**
     * 
     * @param id
     * @throws MissingCustomer_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteCustomer", targetNamespace = "http://www.soen487.com/lab05", className = "com.example.soap.client.service.DeleteCustomer")
    @ResponseWrapper(localName = "deleteCustomerResponse", targetNamespace = "http://www.soen487.com/lab05", className = "com.example.soap.client.service.DeleteCustomerResponse")
    @Action(input = "http://www.soen487.com/lab05/Customer/deleteCustomerRequest", output = "http://www.soen487.com/lab05/Customer/deleteCustomerResponse", fault = {
        @FaultAction(className = MissingCustomer_Exception.class, value = "http://www.soen487.com/lab05/Customer/deleteCustomer/Fault/MissingCustomer")
    })
    public void deleteCustomer(
        @WebParam(name = "id", targetNamespace = "")
        String id)
        throws MissingCustomer_Exception
    ;

    /**
     * 
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downloadImage", targetNamespace = "http://www.soen487.com/lab05", className = "com.example.soap.client.service.DownloadImage")
    @ResponseWrapper(localName = "downloadImageResponse", targetNamespace = "http://www.soen487.com/lab05", className = "com.example.soap.client.service.DownloadImageResponse")
    @Action(input = "http://www.soen487.com/lab05/Customer/downloadImageRequest", output = "http://www.soen487.com/lab05/Customer/downloadImageResponse")
    public byte[] downloadImage();

}
