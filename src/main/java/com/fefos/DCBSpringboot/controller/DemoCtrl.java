package com.fefos.DCBSpringboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCtrl { //Calling data from app properties

    @Value("${demo.message}")
    private String demoMessage;

    @GetMapping("/")
    public String demo(){
        return demoMessage;
    }
}
