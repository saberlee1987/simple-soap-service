package com.saber.simple_soap.main;

import com.saber.simple_soap.soap.HelloService;

import javax.xml.ws.Endpoint;

public class MainApp {
    public static void main(String[] args) {
        String url = "http://localhost:9090/helloService";
        Endpoint.publish(url,new HelloService());
        System.out.println("service launch ===> "+url+"?wsdl");
    }
}
