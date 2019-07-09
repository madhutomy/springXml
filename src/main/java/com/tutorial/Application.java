package com.tutorial;

import com.tutorial.model.Employee;
import com.tutorial.service.CustomerService;
import com.tutorial.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main (String args[]) {

//        CustomerService customerService = new CustomerServiceImpl();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(customerService.findAll().get(0).getFirstName());
        EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
        Employee employee = employeeService.findAll().get(0);
        System.out.println(employee.getName() + ", " + employee.getDept() + ", " + employee.getEmpId());
    }
}