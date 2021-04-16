package com.rest.full.api.springcms.api;/*
 * Created by Mahdiye on 2021, Apr, 15
 */

import com.rest.full.api.springcms.exception.ApplicationError;
import com.rest.full.api.springcms.exception.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@RestController
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ApplicationError> handleCustomerNotFoundException(CustomerNotFoundException customerNotFoundException, WebRequest webRequest){

        ApplicationError error = new ApplicationError();

        error.setCode(101);
        error.setMessage(customerNotFoundException.getMessage());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }
}
