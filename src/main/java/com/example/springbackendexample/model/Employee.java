package com.example.springbackendexample.model;


import lombok.Data;

import javax.persistence.*;

@Data//uses the lombok data annotation to create the getter, setter, toString, and other methods.
@Entity // uses Entity annotation from javaxpersistence package
@Table(name = "employees") //jpa annotation
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email")
    private String email;

}
