package com.orderdelivery.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
