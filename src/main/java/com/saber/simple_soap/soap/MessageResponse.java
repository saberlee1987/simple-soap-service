package com.saber.simple_soap.soap;

import javax.xml.bind.annotation.*;
import java.util.Objects;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageResponse",propOrder = {
        "message"
})
@XmlRootElement(name = "MessageResponse")
public class MessageResponse {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageResponse messageResponse = (MessageResponse) o;
        return Objects.equals(message, messageResponse.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        return "HelloDto{" +
                "message='" + message + '\'' +
                '}';
    }
}
