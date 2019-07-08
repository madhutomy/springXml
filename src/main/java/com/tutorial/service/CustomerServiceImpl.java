package com.tutorial.service;

import com.tutorial.model.Customer;
import com.tutorial.repository.CustomerRepository;

import java.util.List;


public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}