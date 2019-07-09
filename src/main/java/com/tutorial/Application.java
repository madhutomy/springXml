package com.tutorial;

import com.tutorial.model.Car;
import com.tutorial.model.Employee;
import com.tutorial.service.CarService;
import com.tutorial.service.CustomerService;
import com.tutorial.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main (String args[]) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Setter Injection
        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(customerService.findAll().get(0).getFirstName());

        // Constructor Injection
        EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
        Employee employee = employeeService.findAll().get(0);
        System.out.println(employee.getName() + ", " + employee.getDept() + ", " + employee.getEmpId());

        // Autowire-constructor example
        CarService carService = applicationContext.getBean("carService", CarService.class);
        Car car = carService.findAll().get(0);
        System.out.println(car.getMake() + " <> " + car.getModel() + " <> " + car.getTrim() + " <> " + car.getYear());
    }
}