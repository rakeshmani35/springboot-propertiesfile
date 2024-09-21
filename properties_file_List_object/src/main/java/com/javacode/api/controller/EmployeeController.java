package com.javacode.api.controller;

import com.javacode.api.config.EmployeeConfig;
import com.javacode.api.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    private EmployeeConfig employeeConfig;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        List<Employee> employees = employeeConfig.getEmployees();
        System.out.print(employees);
        return employees;
    }
}
