package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class Controller {

    @RequestMapping("/sayHello")
    public String sayHello(String str){
        return "传入的值为:"+str;
    }
}
