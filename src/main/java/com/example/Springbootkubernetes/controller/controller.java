package com.example.Springbootkubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/h")
public class controller {
    @GetMapping("/welcome")
    public String h(){
        return "hello";
    }

}
