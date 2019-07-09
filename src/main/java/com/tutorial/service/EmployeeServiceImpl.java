package com.tutorial.service;

import com.tutorial.model.Employee;
import com.tutorial.repository.EmployeeRepository;

import java.util.List;


public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}