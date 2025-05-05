package com.muslimdemo.muslimdemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MuslimDemoProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuslimDemoProjectApplication.class, args);
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World  Spring Boot";
    }
}
