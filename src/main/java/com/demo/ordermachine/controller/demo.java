package com.demo.ordermachine.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class demo {
    @GetMapping(path="/demo")
    public String demo(){
        return "Congradulations!";
    }
}
