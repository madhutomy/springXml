package com.tutorial.repository;

import com.tutorial.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Madhu");
        customer.setLastName("Tomy");
        customerList.add(customer);

        return  customerList;
    }
}
