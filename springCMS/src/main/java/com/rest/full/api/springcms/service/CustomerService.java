package com.rest.full.api.springcms.service;/*
 * Created by Mahdiye on 2021, Apr, 06
 */

import com.rest.full.api.springcms.dao.CustomerDAO;
import com.rest.full.api.springcms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {


    @Autowired
    private CustomerDAO customerDAO;

//    private int count = 1;

    private List<Customer> customers = new CopyOnWriteArrayList<>();


    public Customer addCustomer(Customer customer) {
//        customer.setCustomerId(count);
//        count++;
//        customers.add(customer);
//        return customer;
        return customerDAO.save(customer);
    }

    public List<Customer> getCustomers() {
//        return customers;
        return customerDAO.findAll();
    }

    public Customer getCustomer(int customerId) {
        return customers
                .stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();

    }

    public Customer updateCustomer(int customerId, Customer customer) {
        customers
                .stream()
                .forEach(c -> {
                            if (c.getCustomerId() == customerId) {
                                c.setCustomerEmail(customer.getCustomerEmail());
                                c.setCustomerFirstName(customer.getCustomerFirstName());
                                c.setCustomerEmail(customer.getCustomerEmail());
                            }
                        }
                );

        return customers
                .stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();
    }

    public void deleteCustomer(int customerId) {
        customers
                .stream()
                .forEach(c -> {
                            if (c.getCustomerId() == customerId) {
                                customers.remove(c);
                            }
                        }
                );

    }
}
