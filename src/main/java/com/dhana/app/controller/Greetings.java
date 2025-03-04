package com.dhana.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

    @GetMapping("/greet")
    public String greet() {
        return "Greetings from SpringBoot Application";
    }
}
