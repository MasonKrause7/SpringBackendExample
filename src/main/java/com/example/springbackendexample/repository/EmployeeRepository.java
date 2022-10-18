package com.example.springbackendexample.repository;

import com.example.springbackendexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> { //jparepository is already annotated w/ @repository so no need to annotate the EmployeeRepository



}
