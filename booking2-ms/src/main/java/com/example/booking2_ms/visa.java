package com.example.booking2_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visa {
    @GetMapping("/visa")
    public String getData() {
        return "Please  book visa ticket with 30% discount";
    }
}