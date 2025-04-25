package com.fedecafe.view.ws.soap.impl;

import jakarta.ejb.Stateless;
import jakarta.jws.WebService;
import com.fedecafe.view.ws.soap.SoapService;

@Stateless
@WebService(
    serviceName = "SoapService",
    portName = "SoapServicePort",
    targetNamespace = "http://cafedecolombia.com/wsdl",
    endpointInterface = "com.fedecafe.view.ws.soap.SoapService"
)
public class SoapServiceImpl implements SoapService {
    
    @Override
    public String saludar(String nombre) {
        return "Hola " + nombre + " desde JBoss EAP 8!";
    }
    
    @Override
    public int sumar(int a, int b) {
        return a + b;
    }
}