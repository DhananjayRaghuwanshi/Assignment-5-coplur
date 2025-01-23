package com.management.Employee.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Employee {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer employeeId;

        @Column(nullable = false)
        private String name;

        @Column(nullable = false, unique = true)
        private String email;

        private String position;

        private BigDecimal salary;

        //getters and setters

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
