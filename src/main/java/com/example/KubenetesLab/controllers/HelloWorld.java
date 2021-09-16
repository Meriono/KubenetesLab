package com.example.KubenetesLab.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hanna Edlund
 * Date: 2021-09-16
 * Time: 13:12
 * Project: KubenetesLab
 */
@RestController
public class HelloWorld {

    @GetMapping(path = "/hello")
    public String getHello(){
        return "Hello, World";
    }
}
