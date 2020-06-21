package com.luban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/getUser.do")
    public String getUser(){
        return "getUser";
    }

    @RequestMapping("/getPower.do")
    public Object getPower(){
        return restTemplate.getForObject("http://localhost:6000/getPower.do",Object.class);
    }

}
