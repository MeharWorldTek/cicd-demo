package com.CICI.Deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/welcome")
    public String welcome() {
        return "Welcome to CI/CD!";
    }
}
