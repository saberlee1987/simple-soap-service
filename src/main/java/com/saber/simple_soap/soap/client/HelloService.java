package com.saber.simple_soap.soap.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.3
 * 2023-03-27T13:23:59.701+03:30
 * Generated source version: 3.5.3
 *
 */
@WebService(targetNamespace = "http://soap.simple_soap.saber.com/", name = "HelloService")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloService {

    @WebMethod(operationName = "SayHello", action = "SayHello")
    @RequestWrapper(localName = "SayHello", targetNamespace = "http://soap.simple_soap.saber.com/", className = "com.saber.simple_soap.soap.client.SayHello")
    @ResponseWrapper(localName = "SayHelloResponse", targetNamespace = "http://soap.simple_soap.saber.com/", className = "com.saber.simple_soap.soap.client.SayHelloResponse")
    @WebResult(name = "MessageResponse", targetNamespace = "")
    public com.saber.simple_soap.soap.client.MessageResponse sayHello(

        @WebParam(name = "firstName", targetNamespace = "")
        java.lang.String firstName,
        @WebParam(name = "lastName", targetNamespace = "")
        java.lang.String lastName
    );

    @WebMethod(operationName = "SayBye", action = "SayBye")
    @RequestWrapper(localName = "SayBye", targetNamespace = "http://soap.simple_soap.saber.com/", className = "com.saber.simple_soap.soap.client.SayBye")
    @ResponseWrapper(localName = "SayByeResponse", targetNamespace = "http://soap.simple_soap.saber.com/", className = "com.saber.simple_soap.soap.client.SayByeResponse")
    @WebResult(name = "MessageResponse", targetNamespace = "")
    public com.saber.simple_soap.soap.client.MessageResponse sayBye(

        @WebParam(name = "firstName", targetNamespace = "")
        java.lang.String firstName,
        @WebParam(name = "lastName", targetNamespace = "")
        java.lang.String lastName
    );
}
