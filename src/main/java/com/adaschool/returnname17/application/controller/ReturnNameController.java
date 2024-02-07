package com.adaschool.returnname17.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/name")
public class ReturnNameController {
    @GetMapping
    public String returnName(){
        return "Angel";
    }
}
