package com.rest.full.api.springcms.service;/*
 * Created by Mahdiye on 2021, Apr, 06
 */

import com.rest.full.api.springcms.dao.CustomerDAO;
import com.rest.full.api.springcms.exception.CustomerNotFoundException;
import com.rest.full.api.springcms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {


    @Autowired
    private CustomerDAO customerDAO;


    private List<Customer> customers = new CopyOnWriteArrayList<>();


    public Customer addCustomer(Customer customer) {

        return customerDAO.save(customer);
    }

    public List<Customer> getCustomers() {
        return customerDAO.findAll();
    }

    public Customer getCustomer(int customerId) {

        Optional<Customer> optionalCustomer = customerDAO.findById(customerId);

        if (!optionalCustomer.isPresent())
            throw new CustomerNotFoundException("Customer Record is not Available");
        return optionalCustomer.get();

    }

    public Customer updateCustomer(int customerId, Customer customer) {

        customer.setCustomerId(customerId);
        return customerDAO.save(customer);
    }

    public void deleteCustomer(int customerId) {

        customerDAO.deleteById(customerId);

    }
}
