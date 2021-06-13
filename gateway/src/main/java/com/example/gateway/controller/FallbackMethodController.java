package com.example.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/serviceFallback/{name}")
    public String serviceFallback(@PathVariable("name") String serviceName){
        return serviceName + " is taking too long to respond, please try again later";
    }
}
