package com.rest.full.api.springcms.api;/*
 * Created by Mahdiye on 2021, Apr, 21
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Home {

    @GetMapping
    public String home(){
        return "Application is working!!!"+new Date();
    }
}
