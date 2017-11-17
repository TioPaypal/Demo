package com.example.demo.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(path = "/hello/{name}", method = RequestMethod.GET)
    public String helloWorld(@PathVariable String name){
        return "hello world" + name;
    }

}
