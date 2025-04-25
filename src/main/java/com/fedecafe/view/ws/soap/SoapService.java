package com.fedecafe.view.ws.soap;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService(targetNamespace = "http://cafedecolombia.com/wsdl")
public interface SoapService {
    @WebMethod
    String saludar(@WebParam(name = "nombre") String nombre);
    
    @WebMethod
    int sumar(@WebParam(name = "a") int a, @WebParam(name = "b") int b);
}