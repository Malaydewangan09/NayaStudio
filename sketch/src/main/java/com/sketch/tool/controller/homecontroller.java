package com.sketch.tool.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class homecontroller {

    @GetMapping("/")
    public String home(){
       return  "without login accessible route" ;
    }


    @GetMapping("/create")
    public String create(){
        return "here will be our sketch app" ;
    }
}
