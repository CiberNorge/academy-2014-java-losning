package no.ciber.academy.service;

import no.ciber.academy.domain.HelloWorld;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceMock implements HelloWorldService {

    @Override
    public HelloWorld retrieveHelloWorld() {
        return new HelloWorld();
    }
}
