
package com.myservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.myservice package. 
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

    private final static QName _InsertItemResponse_QNAME = new QName("http://myservice.com/", "InsertItemResponse");
    private final static QName _GetAllItems_QNAME = new QName("http://myservice.com/", "GetAllItems");
    private final static QName _GetAllItemsResponse_QNAME = new QName("http://myservice.com/", "GetAllItemsResponse");
    private final static QName _InsertItem_QNAME = new QName("http://myservice.com/", "InsertItem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.myservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertItemResponse }
     * 
     */
    public InsertItemResponse createInsertItemResponse() {
        return new InsertItemResponse();
    }

    /**
     * Create an instance of {@link GetAllItems }
     * 
     */
    public GetAllItems createGetAllItems() {
        return new GetAllItems();
    }

    /**
     * Create an instance of {@link GetAllItemsResponse }
     * 
     */
    public GetAllItemsResponse createGetAllItemsResponse() {
        return new GetAllItemsResponse();
    }

    /**
     * Create an instance of {@link InsertItem }
     * 
     */
    public InsertItem createInsertItem() {
        return new InsertItem();
    }

    /**
     * Create an instance of {@link Items }
     * 
     */
    public Items createItems() {
        return new Items();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myservice.com/", name = "InsertItemResponse")
    public JAXBElement<InsertItemResponse> createInsertItemResponse(InsertItemResponse value) {
        return new JAXBElement<InsertItemResponse>(_InsertItemResponse_QNAME, InsertItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myservice.com/", name = "GetAllItems")
    public JAXBElement<GetAllItems> createGetAllItems(GetAllItems value) {
        return new JAXBElement<GetAllItems>(_GetAllItems_QNAME, GetAllItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myservice.com/", name = "GetAllItemsResponse")
    public JAXBElement<GetAllItemsResponse> createGetAllItemsResponse(GetAllItemsResponse value) {
        return new JAXBElement<GetAllItemsResponse>(_GetAllItemsResponse_QNAME, GetAllItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myservice.com/", name = "InsertItem")
    public JAXBElement<InsertItem> createInsertItem(InsertItem value) {
        return new JAXBElement<InsertItem>(_InsertItem_QNAME, InsertItem.class, null, value);
    }

}
