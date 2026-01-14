package com.example.booking2_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class railway {
    @GetMapping("/railway")
    public String getData() {
        return "Please  railwat ticket with 30% discount";
    }
}