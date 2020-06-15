package com.example.demo;

//import gen.Country;
//import gen.GetCountryRequest;
//import gen.GetCountryResponse;
//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import se.east.*;

@Endpoint
public class CountryEndpoint {

    private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";


    //
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        Country c = new Country();
        c.setCapital("test Capital");
        c.setName("test name");
        c.setPopulation(1);
        response.setCountry(c);

        return response;
    }
}