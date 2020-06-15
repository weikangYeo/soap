package com.example.soapclient;

import com.baeldung.springsoap.client.gen.Country;
import com.baeldung.springsoap.client.gen.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CountryClientController {

    @Autowired
    private CountryClient countryClient;

    @GetMapping("/")
    public String test(){
        return "server started";
    }

    @GetMapping("/soap")
    public String testSoap(){
        GetCountryResponse response = countryClient.getCountry("Poland");

        String testData = Optional.ofNullable(response)
               .map(GetCountryResponse::getCountry)
               .map(Country::getName)
                .orElse("Call failed");

        return testData;
    }
}
