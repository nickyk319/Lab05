package com.example.soap.service;

import com.sun.istack.ByteArrayDataSource;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class holds the implementation of the methods of our SOAP web service
 */
@WebService(name="Customer", endpointInterface = "com.example.soap.service.Customer")
public class CustomerImpl implements Customer {
    HashMap<String, CustomerPOJO> customersInfo = new HashMap<>();
    List<String> customers = new ArrayList<>();
    private byte[] receiveFile =new byte[0];//To avoid Null pointer Exception
    private String mime="image/jpeg";
    /**
     * Prints a simple message with input from the client.
     * @param content
     * @return
     */
    @Override
    public String sayHelloWorld(String content) {
        return "Hello " + content + "!";
    }

    @Override
    public List<String> getAllCustomer() {
        for (Map.Entry mapElement : customersInfo.entrySet()) {
            CustomerPOJO customer = (CustomerPOJO) mapElement.getValue();
            customers.add(customer.toString());
        }
        return customers;
    }

    @Override
    public String getCustomer(String id) throws MissingCustomer {
        if (!customersInfo.containsKey(id)) {
            throw new MissingCustomer();
        }
        return customersInfo.get(id).toString();
    }

    @Override
    public void addCustomer(String id, String name, String buildingAndStreet, String city, String zip) throws DuplicateCustomer {
        CustomerPOJO customer = new CustomerPOJO(id, name, buildingAndStreet, city, zip);
        if (!customersInfo.containsKey(id)){
            customersInfo.put(id, customer);
        }else{
            throw new DuplicateCustomer();
        }
    }

    @Override
    public void updateCustomer(String id, String name, String buildingAndStreet, String city, String zip) throws MissingCustomer {
        if (customersInfo.containsKey(id)){
            CustomerPOJO customerPOJO = customersInfo.get(id);
            customerPOJO.setName(name);
            customerPOJO.address.setBuildingAndStreet(buildingAndStreet);
            customerPOJO.address.setCity(city);
            customerPOJO.address.setZip(zip);
        }else{
            throw new MissingCustomer();
        }
    }

    @Override
    public void deleteCustomer(String id) throws MissingCustomer {
        if (customersInfo.containsKey(id)) {
            customersInfo.remove(id);
        }else{
            throw new MissingCustomer();
        }
    }

    @Override
    public DataHandler downloadImage(){
        DataSource dataSource=new ByteArrayDataSource(receiveFile, mime);
        DataHandler data= new DataHandler(dataSource);
        return data;
    }

}
