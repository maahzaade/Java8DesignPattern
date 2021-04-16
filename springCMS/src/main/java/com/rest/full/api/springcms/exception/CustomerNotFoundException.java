package com.rest.full.api.springcms.exception;/*
 * Created by Mahdiye on 2021, Apr, 15
 */

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(String message){
        super(message);
    }


}
