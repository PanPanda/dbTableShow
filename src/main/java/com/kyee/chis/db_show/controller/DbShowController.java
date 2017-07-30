package com.kyee.chis.db_show.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tableInfo")
public class DbShowController {

    @RequestMapping("/hello")
    public String getHello(){
        return "hello";
    }
}
