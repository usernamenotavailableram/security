package com.example.securitycomponent.security.Authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
    @GetMapping("helloworldapi")
    public String helloWorld()
    {
        System.out.println("Hi");
        return "HelloworldApi";
    }
}
