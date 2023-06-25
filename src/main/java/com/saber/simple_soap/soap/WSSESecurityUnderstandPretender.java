package com.saber.simple_soap.soap;

import org.w3c.dom.Node;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WSSESecurityUnderstandPretender implements SOAPHandler<SOAPMessageContext> {

    private static final String WSSE_NS_URI = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
    private static final QName QNAME_WSSE_USERNAMETOKEN = new QName(WSSE_NS_URI, "UsernameToken");
    private static final QName QNAME_WSSE_USERNAME = new QName(WSSE_NS_URI, "Username");
    private static final QName QNAME_WSSE_PASSWORD = new QName(WSSE_NS_URI, "Password");
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    @Override
    public Set<QName> getHeaders() {
        final QName securityHeader = new QName(
                "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
                "Security",
                "wsse");

        final Set<QName> headers = new HashSet<>();
        headers.add(securityHeader);

        // notify the runtime that this is handled
        return headers;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        Boolean outbound = (Boolean) context
                .get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if ((outbound != null) && (!outbound)) {
            handleInboundMessage(context);
        }
        String username = (String) context.get(USERNAME);
        String password = (String) context.get(PASSWORD);

        System.out.println("username ===> "+username);
        System.out.println("password ===> "+password);

        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext soapMessageContext) {
        return true;
    }

    @Override
    public void close(MessageContext messageContext) {

    }


    private void handleInboundMessage(SOAPMessageContext context) {
        String wsseUsername = null;
        String wssePassword = null;
        try {
            SOAPHeader header = context.getMessage().getSOAPHeader();
            Iterator<?> headerElements = header.examineAllHeaderElements();
            while (headerElements.hasNext()) {
                SOAPHeaderElement headerElement = (SOAPHeaderElement) headerElements
                        .next();
                if (headerElement.getElementName().getLocalName()
                        .equals("Security")) {
                    Iterator<?> it2 = headerElement.getChildElements();
                    while (it2.hasNext()) {
                        Node soapNode = (Node) it2.next();
                        if (soapNode instanceof SOAPElement element) {
                            QName elementQname = element.getElementQName();
                            if (QNAME_WSSE_USERNAMETOKEN.equals(elementQname)) {
                                wsseUsername = getFirstChildElementValue(element, QNAME_WSSE_USERNAME);
                                wssePassword = getFirstChildElementValue(element, QNAME_WSSE_PASSWORD);
                                break;
                            }
                        }
                        if (wsseUsername != null) {
                            break;
                        }
                    }
                }
                context.put(USERNAME, wsseUsername);
                context.setScope(USERNAME, MessageContext.Scope.APPLICATION);

                context.put(PASSWORD, wssePassword);
                context.setScope(PASSWORD, MessageContext.Scope.APPLICATION);
            }
        } catch (Exception e) {
            System.out.println("Error reading SOAP message context: " + e);
            e.printStackTrace();
        }

    }

    private String getFirstChildElementValue(SOAPElement soapElement, QName qNameToFind) {
        String value = null;
        Iterator<?> it = soapElement.getChildElements(qNameToFind);
        while (it.hasNext()) {
            SOAPElement element = (SOAPElement) it.next(); //use first
            value = element.getValue();
        }
        return value;
    }

}
