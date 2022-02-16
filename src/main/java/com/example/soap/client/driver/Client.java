package com.example.soap.client.driver;

import com.example.soap.client.service.*;

import javax.xml.soap.SOAPException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException, SOAPException {
        CustomerImplService service=new CustomerImplService();
        Customer port = service.getCustomerPort();
        String result= null;
        String mime="image/jpeg";

        System.out.println("*******************Test ADD*******************");
        try{
            port.addCustomer("01aaa", "Lily", "220 chemin du Golf", "Verdun", "H2Q");
            port.addCustomer("01bbb", "Nicky", "230 chemin du Football", "LaSalle", "H3T");
            port.addCustomer("01ccc", "Jerry", "240 chemin du Tennis", "Westmont", "H5U");
        }catch(DuplicateCustomer_Exception e){
            System.out.println("Duplicate customer!");
        }

        // show customers
        for (String customerInfo : port.getAllCustomer()){
            System.out.println(customerInfo);
        }

        System.out.println("\n*******************Test GET*******************");
        try{
            System.out.println(port.getCustomer("01ddd"));
        } catch (MissingCustomer_Exception e) {
            System.out.println("No customer found!");
        }

        try{
            System.out.println(port.getCustomer("01ccc"));
        } catch (MissingCustomer_Exception e) {
            System.out.println("No customer found!");
        }

        System.out.println("\n*******************Test UPDATE*******************");
        try{
            port.updateCustomer("01aaa", "John", "150 place du commerce", "Kirkland", "J0Y");
        } catch (MissingCustomer_Exception e) {
            System.out.println("No customer found!");
        }
        try{
            System.out.println(port.getCustomer("01aaa"));
        } catch (MissingCustomer_Exception e) {
            System.out.println("No customer found!");
        }


        System.out.println("\n*******************Test DELETE*******************");
        try{
            port.deleteCustomer("01bbb");
            System.out.println("Deleted");
        } catch (MissingCustomer_Exception e) {
            System.out.println("No customer found!");
        }
        try{
            System.out.println(port.getCustomer("01bbb"));
        } catch (MissingCustomer_Exception e) {
            System.out.println("No customer found!");
        }


        System.out.println("\n*******************File DOWNLOAD*******************");
        try {
            byte[] downloadImage= new byte[0];
            downloadImage = port.downloadImage();
            FileOutputStream fileOutput = new FileOutputStream(new File("/Users/nicky/Pictures/wallpaper/DownloadedImage.jpg"));
            fileOutput.write(downloadImage);
            System.out.println("File Downloaded In The Specified Path");
            fileOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
