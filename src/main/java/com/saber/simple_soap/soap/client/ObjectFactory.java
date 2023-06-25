
package com.saber.simple_soap.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.saber.simple_soap.soap.client package. 
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

    private final static QName _SayBye_QNAME = new QName("http://soap.simple_soap.saber.com/", "SayBye");
    private final static QName _SayByeResponse_QNAME = new QName("http://soap.simple_soap.saber.com/", "SayByeResponse");
    private final static QName _SayHello_QNAME = new QName("http://soap.simple_soap.saber.com/", "SayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://soap.simple_soap.saber.com/", "SayHelloResponse");
    private final static QName _MessageResponse_QNAME = new QName("http://services.sample_cxf_soap.saber.com/", "MessageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.saber.simple_soap.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayBye }
     * 
     */
    public SayBye createSayBye() {
        return new SayBye();
    }

    /**
     * Create an instance of {@link SayByeResponse }
     * 
     */
    public SayByeResponse createSayByeResponse() {
        return new SayByeResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link MessageResponse }
     * 
     */
    public MessageResponse createMessageResponse() {
        return new MessageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayBye }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayBye }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.simple_soap.saber.com/", name = "SayBye")
    public JAXBElement<SayBye> createSayBye(SayBye value) {
        return new JAXBElement<SayBye>(_SayBye_QNAME, SayBye.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayByeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayByeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.simple_soap.saber.com/", name = "SayByeResponse")
    public JAXBElement<SayByeResponse> createSayByeResponse(SayByeResponse value) {
        return new JAXBElement<SayByeResponse>(_SayByeResponse_QNAME, SayByeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.simple_soap.saber.com/", name = "SayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.simple_soap.saber.com/", name = "SayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sample_cxf_soap.saber.com/", name = "MessageResponse")
    public JAXBElement<MessageResponse> createMessageResponse(MessageResponse value) {
        return new JAXBElement<MessageResponse>(_MessageResponse_QNAME, MessageResponse.class, null, value);
    }

}
