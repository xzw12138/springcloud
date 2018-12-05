package com.example.servicefeign.impl;


import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedulServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,"+name;
    }
}
