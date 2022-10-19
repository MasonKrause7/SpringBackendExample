package com.example.springbackendexample.controller;

import com.example.springbackendexample.model.Employee;
import com.example.springbackendexample.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;
//depends on the employeeService interface
    public EmployeeController(EmployeeService employeeService){
        super();
        this.employeeService = employeeService;
    }

    //build create employee REST API
    @PostMapping()//handles post request
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
        //using the service classes saveEmployee method
    }

    //build get all employees REST API
    @GetMapping//handles get Request
    public List<Employee> getAllEmployees(){
        return employeeService.getEmployees();
        //using the service classes getEmployees method, which is using the JPA findAll method
    }

    //build get employee by Id REST API
    //http:localhost:8080/api/employees/1 <-- path variable is dynamic, is the ID of the desired employee
    @GetMapping("{id}")//URL template variable
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
        return null;
    }

}
