
package com.example.soap.client.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.soap.client.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteCustomer_QNAME = new QName("http://www.soen487.com/lab05", "deleteCustomer");
    private final static QName _MissCustomer_QNAME = new QName("http://www.soen487.com/lab05", "MissCustomer");
    private final static QName _GetCustomer_QNAME = new QName("http://www.soen487.com/lab05", "getCustomer");
    private final static QName _SayHelloWorldResponse_QNAME = new QName("http://www.soen487.com/lab05", "sayHelloWorldResponse");
    private final static QName _GetCustomerResponse_QNAME = new QName("http://www.soen487.com/lab05", "getCustomerResponse");
    private final static QName _AddCustomerResponse_QNAME = new QName("http://www.soen487.com/lab05", "addCustomerResponse");
    private final static QName _SayHelloWorld_QNAME = new QName("http://www.soen487.com/lab05", "sayHelloWorld");
    private final static QName _UpdateCustomer_QNAME = new QName("http://www.soen487.com/lab05", "updateCustomer");
    private final static QName _UpdateCustomerResponse_QNAME = new QName("http://www.soen487.com/lab05", "updateCustomerResponse");
    private final static QName _DeleteCustomerResponse_QNAME = new QName("http://www.soen487.com/lab05", "deleteCustomerResponse");
    private final static QName _DownloadImage_QNAME = new QName("http://www.soen487.com/lab05", "downloadImage");
    private final static QName _GetAllCustomerResponse_QNAME = new QName("http://www.soen487.com/lab05", "getAllCustomerResponse");
    private final static QName _DuplicateCustomer_QNAME = new QName("http://www.soen487.com/lab05", "DuplicateCustomer");
    private final static QName _GetAllCustomer_QNAME = new QName("http://www.soen487.com/lab05", "getAllCustomer");
    private final static QName _AddCustomer_QNAME = new QName("http://www.soen487.com/lab05", "addCustomer");
    private final static QName _DownloadImageResponse_QNAME = new QName("http://www.soen487.com/lab05", "downloadImageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.soap.client.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link SayHelloWorldResponse }
     * 
     */
    public SayHelloWorldResponse createSayHelloWorldResponse() {
        return new SayHelloWorldResponse();
    }

    /**
     * Create an instance of {@link AddCustomerResponse }
     * 
     */
    public AddCustomerResponse createAddCustomerResponse() {
        return new AddCustomerResponse();
    }

    /**
     * Create an instance of {@link MissingCustomer }
     * 
     */
    public MissingCustomer createMissingCustomer() {
        return new MissingCustomer();
    }

    /**
     * Create an instance of {@link DeleteCustomer }
     * 
     */
    public DeleteCustomer createDeleteCustomer() {
        return new DeleteCustomer();
    }

    /**
     * Create an instance of {@link GetCustomer }
     * 
     */
    public GetCustomer createGetCustomer() {
        return new GetCustomer();
    }

    /**
     * Create an instance of {@link AddCustomer }
     * 
     */
    public AddCustomer createAddCustomer() {
        return new AddCustomer();
    }

    /**
     * Create an instance of {@link DownloadImageResponse }
     * 
     */
    public DownloadImageResponse createDownloadImageResponse() {
        return new DownloadImageResponse();
    }

    /**
     * Create an instance of {@link SayHelloWorld }
     * 
     */
    public SayHelloWorld createSayHelloWorld() {
        return new SayHelloWorld();
    }

    /**
     * Create an instance of {@link UpdateCustomer }
     * 
     */
    public UpdateCustomer createUpdateCustomer() {
        return new UpdateCustomer();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link DuplicateCustomer }
     * 
     */
    public DuplicateCustomer createDuplicateCustomer() {
        return new DuplicateCustomer();
    }

    /**
     * Create an instance of {@link GetAllCustomer }
     * 
     */
    public GetAllCustomer createGetAllCustomer() {
        return new GetAllCustomer();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link DownloadImage }
     * 
     */
    public DownloadImage createDownloadImage() {
        return new DownloadImage();
    }

    /**
     * Create an instance of {@link GetAllCustomerResponse }
     * 
     */
    public GetAllCustomerResponse createGetAllCustomerResponse() {
        return new GetAllCustomerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "deleteCustomer")
    public JAXBElement<DeleteCustomer> createDeleteCustomer(DeleteCustomer value) {
        return new JAXBElement<DeleteCustomer>(_DeleteCustomer_QNAME, DeleteCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MissingCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "MissCustomer")
    public JAXBElement<MissingCustomer> createMissCustomer(MissingCustomer value) {
        return new JAXBElement<MissingCustomer>(_MissCustomer_QNAME, MissingCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "getCustomer")
    public JAXBElement<GetCustomer> createGetCustomer(GetCustomer value) {
        return new JAXBElement<GetCustomer>(_GetCustomer_QNAME, GetCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "sayHelloWorldResponse")
    public JAXBElement<SayHelloWorldResponse> createSayHelloWorldResponse(SayHelloWorldResponse value) {
        return new JAXBElement<SayHelloWorldResponse>(_SayHelloWorldResponse_QNAME, SayHelloWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "getCustomerResponse")
    public JAXBElement<GetCustomerResponse> createGetCustomerResponse(GetCustomerResponse value) {
        return new JAXBElement<GetCustomerResponse>(_GetCustomerResponse_QNAME, GetCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "addCustomerResponse")
    public JAXBElement<AddCustomerResponse> createAddCustomerResponse(AddCustomerResponse value) {
        return new JAXBElement<AddCustomerResponse>(_AddCustomerResponse_QNAME, AddCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "sayHelloWorld")
    public JAXBElement<SayHelloWorld> createSayHelloWorld(SayHelloWorld value) {
        return new JAXBElement<SayHelloWorld>(_SayHelloWorld_QNAME, SayHelloWorld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "updateCustomer")
    public JAXBElement<UpdateCustomer> createUpdateCustomer(UpdateCustomer value) {
        return new JAXBElement<UpdateCustomer>(_UpdateCustomer_QNAME, UpdateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "updateCustomerResponse")
    public JAXBElement<UpdateCustomerResponse> createUpdateCustomerResponse(UpdateCustomerResponse value) {
        return new JAXBElement<UpdateCustomerResponse>(_UpdateCustomerResponse_QNAME, UpdateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "deleteCustomerResponse")
    public JAXBElement<DeleteCustomerResponse> createDeleteCustomerResponse(DeleteCustomerResponse value) {
        return new JAXBElement<DeleteCustomerResponse>(_DeleteCustomerResponse_QNAME, DeleteCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "downloadImage")
    public JAXBElement<DownloadImage> createDownloadImage(DownloadImage value) {
        return new JAXBElement<DownloadImage>(_DownloadImage_QNAME, DownloadImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "getAllCustomerResponse")
    public JAXBElement<GetAllCustomerResponse> createGetAllCustomerResponse(GetAllCustomerResponse value) {
        return new JAXBElement<GetAllCustomerResponse>(_GetAllCustomerResponse_QNAME, GetAllCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DuplicateCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "DuplicateCustomer")
    public JAXBElement<DuplicateCustomer> createDuplicateCustomer(DuplicateCustomer value) {
        return new JAXBElement<DuplicateCustomer>(_DuplicateCustomer_QNAME, DuplicateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "getAllCustomer")
    public JAXBElement<GetAllCustomer> createGetAllCustomer(GetAllCustomer value) {
        return new JAXBElement<GetAllCustomer>(_GetAllCustomer_QNAME, GetAllCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "addCustomer")
    public JAXBElement<AddCustomer> createAddCustomer(AddCustomer value) {
        return new JAXBElement<AddCustomer>(_AddCustomer_QNAME, AddCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.soen487.com/lab05", name = "downloadImageResponse")
    public JAXBElement<DownloadImageResponse> createDownloadImageResponse(DownloadImageResponse value) {
        return new JAXBElement<DownloadImageResponse>(_DownloadImageResponse_QNAME, DownloadImageResponse.class, null, value);
    }

}
