package com.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class HomeController {

    @GetMapping("/")

    public String welcomeMessage() {
        return "Welcome to COMP367";
    }
    
    public String dynamicGreeting() {
        LocalTime now = LocalTime.now();
        String greeting = now.getHour() < 12 ? "Good morning" : "Good afternoon";
        return greeting + ", Selene, Welcome to COMP367";
    }
}
