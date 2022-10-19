package com.example.springbackendexample.service.impl;

import com.example.springbackendexample.exception.ResourceNotFoundException;
import com.example.springbackendexample.model.Employee;
import com.example.springbackendexample.repository.EmployeeRepository;
import com.example.springbackendexample.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    //depends on the employeeRepository interface
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){ //since this is the only constructor and class is annotated w/ @service
        // spring knows it requires dependency, so no @autowire is required.
        super();
        this.employeeRepository = employeeRepository;
    }

    //implementing the method from EmployeeService interface
    public Employee saveEmployee(Employee employee){

        return employeeRepository.save(employee); // using the jpa method to save an entity
    }
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(long id){
        Optional<Employee> employee = employeeRepository.findById(id);

        if(employee.isPresent()){
            return employee.get();//.get returns content of the optional object
        }
        else{
            throw new ResourceNotFoundException("Employee", "ID", id);
        }
    }
    //could also be implemented using a return statement with a lambda expression


}
