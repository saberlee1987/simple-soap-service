package com.saber.simple_soap.soap.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.wsdl.Port;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.3
 * 2023-03-27T13:23:59.705+03:30
 * Generated source version: 3.5.3
 *
 */
@WebServiceClient(name = "HelloService",
                  wsdlLocation = "file:/D:/SaberAzizi/JavaExamples/Spring/simple-soap-service/src/main/java/com/saber/simple_soap/soap/client/helloService.wsdl",
                  targetNamespace = "http://soap.simple_soap.saber.com/")
public class HelloServiceProxy extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.simple_soap.saber.com/", "HelloService");
    public final static QName HelloServicePort = new QName("http://soap.simple_soap.saber.com/", "HelloServicePort");
    static {

        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");

        URL url = null;
        try {
            url = new URL("http://localhost:9090/helloService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloServiceProxy.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/D:/SaberAzizi/JavaExamples/Spring/simple-soap-service/src/main/java/com/saber/simple_soap/soap/client/helloService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloServiceProxy(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloServiceProxy(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloServiceProxy() {
        super(WSDL_LOCATION, SERVICE);
    }

    public HelloServiceProxy(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloServiceProxy(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloServiceProxy(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServicePort")
    public HelloService getHelloServicePort() {
        return super.getPort(HelloServicePort, HelloService.class);
    }
    public Port getPort(){
        return (Port) super.getPort(HelloServicePort,HelloService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServicePort")
    public HelloService getHelloServicePort(WebServiceFeature... features) {
        return super.getPort(HelloServicePort, HelloService.class, features);
    }

}
