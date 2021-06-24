
package com.myservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InventoryService", targetNamespace = "http://myservice.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InventoryService {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "InsertItem")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "InsertItem", targetNamespace = "http://myservice.com/", className = "com.myservice.InsertItem")
    @ResponseWrapper(localName = "InsertItemResponse", targetNamespace = "http://myservice.com/", className = "com.myservice.InsertItemResponse")
    @Action(input = "http://myservice.com/InventoryService/InsertItemRequest", output = "http://myservice.com/InventoryService/InsertItemResponse")
    public int insertItem(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @return
     *     returns java.util.List<com.myservice.Items>
     */
    @WebMethod(operationName = "GetAllItems")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetAllItems", targetNamespace = "http://myservice.com/", className = "com.myservice.GetAllItems")
    @ResponseWrapper(localName = "GetAllItemsResponse", targetNamespace = "http://myservice.com/", className = "com.myservice.GetAllItemsResponse")
    @Action(input = "http://myservice.com/InventoryService/GetAllItemsRequest", output = "http://myservice.com/InventoryService/GetAllItemsResponse")
    public List<Items> getAllItems();

}