package com.example.java_proj1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
    // i am here for testing the pushing and pull from hourtt
}
