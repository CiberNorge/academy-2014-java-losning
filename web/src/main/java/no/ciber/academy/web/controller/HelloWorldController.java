package no.ciber.academy.web.controller;

import no.ciber.academy.domain.HelloWorld;
import no.ciber.academy.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(value =  "/hello", method = GET)
    public HelloWorld sayHelloWorld() {
        return helloWorldService.retrieveHelloWorld();
    }
}
