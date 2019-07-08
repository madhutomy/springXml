package com.tutorial.repository;

import com.tutorial.model.Customer;

import java.util.List;

public interface CustomerRepository {

    public List<Customer> findAll();
}
