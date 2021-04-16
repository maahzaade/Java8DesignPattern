package com.rest.full.api.springcms.exception;/*
 * Created by Mahdiye on 2021, Apr, 15
 */

public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(String message){
        super(message);
    }

}
