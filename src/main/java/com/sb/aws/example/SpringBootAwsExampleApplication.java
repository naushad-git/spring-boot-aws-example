package com.sb.aws.example;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAwsExampleApplication {

    public static final Logger loggeer = LoggerFactory.getLogger(SpringBootAwsExampleApplication.class);

    @PostConstruct
    public void intt() {
        loggeer.info("Application started .........!");
    }

    @GetMapping("/")
    public String hello() {
        loggeer.info("Inside Get Method .............!");
        return "Spring Boot AWS Example ....!";
    }

    public static void main(String[] args) {
        loggeer.info("Application Executed .............!");
        SpringApplication.run(SpringBootAwsExampleApplication.class, args);
    }

}
