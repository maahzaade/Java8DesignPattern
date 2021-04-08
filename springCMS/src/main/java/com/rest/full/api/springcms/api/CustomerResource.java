package com.rest.full.api.springcms.api;/*
 * Created by Mahdiye on 2021, Apr, 06
 */

import com.rest.full.api.springcms.model.Customer;
import com.rest.full.api.springcms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerResource {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){

        return customerService.addCustomer(customer);

    }

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping(value ="/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") int customerId){
        return customerService.getCustomer(customerId);
    }
}
