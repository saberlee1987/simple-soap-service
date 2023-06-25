package com.saber.simple_soap.main;

import com.saber.simple_soap.soap.PasswordCallBackHandler;
import com.saber.simple_soap.soap.client.HelloService;
import com.saber.simple_soap.soap.client.MessageResponse;
import org.apache.cxf.ext.logging.LoggingInInterceptor;
import org.apache.cxf.ext.logging.LoggingOutInterceptor;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.message.Message;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClient {
    public static void main(String[] args) {

        try {
            JaxWsProxyFactoryBean jaxWsProxyFactory = new JaxWsProxyFactoryBean();
            jaxWsProxyFactory.setServiceClass(HelloService.class);
            jaxWsProxyFactory.setServiceName(new QName(
                    "http://soap.simple_soap.saber.com/",
                    "HelloService"
            ));
            List<Interceptor<? extends Message>> inInterceptors = jaxWsProxyFactory.getInInterceptors();
            List<Interceptor<? extends Message>> outInterceptors = jaxWsProxyFactory.getOutInterceptors();
            List<Interceptor<? extends Message>> inFaultInterceptors = jaxWsProxyFactory.getInFaultInterceptors();
            List<Interceptor<? extends Message>> outFaultInterceptors = jaxWsProxyFactory.getOutFaultInterceptors();
            LoggingInInterceptor loggingInInterceptor = new LoggingInInterceptor();
            LoggingOutInterceptor loggingOutInterceptor = new LoggingOutInterceptor();
            inInterceptors.add(loggingInInterceptor);
            inFaultInterceptors.add(loggingInInterceptor);
            outInterceptors.add(loggingOutInterceptor);
            outFaultInterceptors.add(loggingOutInterceptor);

            Map<String,Object> map = new HashMap<>();
            map.put("action","UsernameToken");
            map.put("user","saber66");
            map.put("passwordType","PasswordText");
            map.put("mustUnderstand","1");
            map.put("passwordCallbackClass", PasswordCallBackHandler.class.getName());
            WSS4JOutInterceptor wss4JOutInterceptor = new WSS4JOutInterceptor(map);
            outInterceptors.add(wss4JOutInterceptor);

            jaxWsProxyFactory.setAddress("http://localhost:9090/helloService");
            HelloService helloService = jaxWsProxyFactory.create(HelloService.class);
            MessageResponse messageResponse = helloService.sayHello("saber", "azizi");
            System.out.println(messageResponse);
            messageResponse = helloService.sayBye("bruce","lee");
            System.out.println(messageResponse);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
