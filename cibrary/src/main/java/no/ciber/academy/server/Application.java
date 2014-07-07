package no.ciber.academy.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@ComponentScan(basePackages = {
        "no.ciber.academy.domain",
        "no.ciber.academy.repository",
        "no.ciber.academy.service",
        "no.ciber.academy.web.controller"})
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "no.ciber.academy.repository")
@Controller
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
