package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "I have successfully built the Spring Boot application using Maven. "
             + "This application is deployed onto Kubernetes using Argo CD.";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
