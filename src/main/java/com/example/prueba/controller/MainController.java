package com.example.prueba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/inicio")
    public String method(){

        return "otro ejemplo";
    }

}
