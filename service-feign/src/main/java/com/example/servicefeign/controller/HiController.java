package com.example.servicefeign.controller;


import com.example.servicefeign.impl.SchedulServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    SchedulServiceHi schedulServiceHi;

    @GetMapping(value="/hi")
    public String sayHi(@RequestParam String name){
        return schedulServiceHi.sayHiFromClientOne(name);
    }
}
