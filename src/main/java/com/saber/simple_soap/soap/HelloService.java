package com.saber.simple_soap.soap;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;

@WebService(serviceName = "HelloService",name = "HelloService")
@HandlerChain(file = "/handler/handler-chain.xml")
public class HelloService {

    @WebMethod(operationName = "SayHello",action = "SayHello")
    @WebResult(name = "MessageResponse")
    public MessageResponse sayHello( @WebParam(partName = "firstName",name = "firstName") String firstName, @WebParam(name = "lastName",partName = "lastName") String lastName) {
        String message = String.format("Hello %s %s", firstName, lastName);
        MessageResponse messageResponse = new MessageResponse();
        messageResponse.setMessage(message);
        return messageResponse;
    }
    @WebMethod(operationName = "SayBye",action = "SayBye")
    @WebResult(name = "MessageResponse")
    public MessageResponse sayBye( @WebParam(partName = "firstName",name = "firstName") String firstName, @WebParam(name = "lastName",partName = "lastName") String lastName) {
        String message = String.format("Bye Bye %s %s", firstName, lastName);
        MessageResponse messageResponse = new MessageResponse();
        messageResponse.setMessage(message);
        return messageResponse;
    }

}
