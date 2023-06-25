
package com.saber.simple_soap.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SayHelloResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SayHelloResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageResponse" type="{http://services.sample_cxf_soap.saber.com/}MessageResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SayHelloResponse", propOrder = {
    "messageResponse"
})
public class SayHelloResponse {

    @XmlElement(name = "MessageResponse")
    protected MessageResponse messageResponse;

    /**
     * Gets the value of the messageResponse property.
     * 
     * @return
     *     possible object is
     *     {@link MessageResponse }
     *     
     */
    public MessageResponse getMessageResponse() {
        return messageResponse;
    }

    /**
     * Sets the value of the messageResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageResponse }
     *     
     */
    public void setMessageResponse(MessageResponse value) {
        this.messageResponse = value;
    }

}
