package com.example.soapclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CountrySoapClientConfig {


        @Bean
        public Jaxb2Marshaller marshaller() {
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
            //generated file package
            marshaller.setContextPath("com.baeldung.springsoap.client.gen");
            return marshaller;
        }
        @Bean
        public CountryClient countryClient(Jaxb2Marshaller marshaller) {
            CountryClient client = new CountryClient();

            //soap host address
            client.setDefaultUri("http://localhost:8080/ws");
            client.setMarshaller(marshaller);
            client.setUnmarshaller(marshaller);
            return client;
        }
}
