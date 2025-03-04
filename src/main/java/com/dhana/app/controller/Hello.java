package com.dhana.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from SpringBoot Application";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "A Welcome Message from SpringBoot App";
    }
}
