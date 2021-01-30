# T04 - SOEN 487 #

This is the template provided to start the web server for Tutorial 4.
You should download this repository to follow along when watching the tutorial.

The finished example can be found on the finished branch of this repository.

We encourage you to use either IntelliJ IDE or maven from command line in order to get the best support from our TAs.

## Existing Classes ##

1. <strong>HelloWorld</strong> interface and class which will hold the functions of our web service.

2. <strong>ServicePublisher</strong> class that publishes the generated WSDL file on an http server.

3. <strong>Client</strong> class which we can use to test without SoapUI.

## IntelliJ Instructions ##

When importing the project in IntelliJ, you can go to File -> New -> Project From Existing Sources... and use the existing pom.xml file to initialize the project.

![Screenshot](img/intellij_existing.png)

Follow the tutorial on how to setup the service classes and the publisher. When they are done, right click on the ServicePublisher and choose Run main().

## Maven Instructions ##

    Run the folllowing commands in the associated project directory:

    Compile:
        mvn install
    Run (ServicePublisher)
        mvn exec:java -Ppublisher
    Clean:
        mvn clean

## Soap UI Testing ##

To test with SoapUI, run the program and click on new SOAP project. While ServicePublisher is still running, enter a project name and copy the WSDL url in the initial WSDL field.

![Screenshot](img/soapui.png)

You can now open requests from the navigator on the left, edit the message and send a SOAP request to the server to get a response. To submit the request, click on the green play button.

![Screenshot](img/soapui2.png)

