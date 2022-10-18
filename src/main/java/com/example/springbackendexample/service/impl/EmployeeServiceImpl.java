package com.example.springbackendexample.service.impl;

import com.example.springbackendexample.model.Employee;
import com.example.springbackendexample.repository.EmployeeRepository;
import com.example.springbackendexample.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){ //since this is the only constructor, spring knows it requires dependency, so no @autowire is required.
        super();
        this.employeeRepository = employeeRepository;
    }

    public Employee saveEmployee(Employee employee){

        return employeeRepository.save(employee); // using the jpa method to save an entity
    }

}
