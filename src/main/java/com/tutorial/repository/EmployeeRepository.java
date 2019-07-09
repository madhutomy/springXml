package com.tutorial.repository;

import com.tutorial.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAll();
}
