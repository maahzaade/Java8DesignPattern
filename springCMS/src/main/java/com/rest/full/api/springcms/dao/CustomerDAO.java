package com.rest.full.api.springcms.dao;/*
 * Created by Mahdiye on 2021, Apr, 13
 */

import com.rest.full.api.springcms.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> {
}
