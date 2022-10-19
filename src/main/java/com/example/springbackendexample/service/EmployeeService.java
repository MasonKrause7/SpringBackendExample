package com.example.springbackendexample.service;

import com.example.springbackendexample.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> getEmployees();

    Employee getEmployeeById(long id);


    //should have an updateEmployee, deleteEmployee, and I guess readEmployee/fetchEmployee.

}
