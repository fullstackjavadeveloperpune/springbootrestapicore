package com.fullstack.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("WELCOME TO FULL STACK JAVA DEVELOPER, PUNE");
    }

    @GetMapping("/services")
    public ResponseEntity<String> sayServices() {
        return ResponseEntity.ok("SOFTWARE DEVELOPMENT");
    }

    @GetMapping("/contact-us")
    public ResponseEntity<String> sayContact(){
        return ResponseEntity.ok("Contact US at Full Stack Java Developer, Pune \n" +
                "Office: +91 7887575991 / 020 4721 2644");
    }
}
