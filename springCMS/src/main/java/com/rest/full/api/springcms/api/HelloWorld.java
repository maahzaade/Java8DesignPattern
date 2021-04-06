package com.rest.full.api.springcms.api;/*
 * Created by Mahdiye on 2021, Apr, 01
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping(value = "/hello")
    public String sayHello(){
        return "Greetings from Spring Boot!";
    }
}
