package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class AdditionController {

    @GetMapping("/ms1/add")
    public String add(@RequestParam int a,
                      @RequestParam int b) {
        int sum = a + b;
        return "MS 1.1 - Additon = " + sum;
    }
}