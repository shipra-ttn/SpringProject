package com.example.demo.Welcome;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping(path="/Welcome")
    public String  welcome()
    {
        return "Welcome to Spring Boot";
    }
}
