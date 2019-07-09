package com.tutorial.repository;

import com.tutorial.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee = new Employee();
        employee.setName("Madhu Tomy");
        employee.setDept("IT");
        employee.setEmpId(12037);
        employeeList.add(employee);

        return  employeeList;
    }
}
