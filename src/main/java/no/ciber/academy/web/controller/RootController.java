package no.ciber.academy.web.controller;

import no.ciber.academy.domain.BookDefinition;
import no.ciber.academy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
