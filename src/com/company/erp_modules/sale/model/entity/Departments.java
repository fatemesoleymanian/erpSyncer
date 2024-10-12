package com.company.erp_modules.sale.model.entity;

import java.util.UUID;

public class Departments {
    private UUID id;
    private String name;
    private Integer manager_id;
    private String location;

    public Departments(UUID id, String name, Integer manager_id, String location) {
        this.id = id;
        this.name = name;
        this.manager_id = manager_id;
        this.location = location;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
//    CREATE TABLE departments (
//        department_id SERIAL PRIMARY KEY,
//        department_name VARCHAR(255) NOT NULL,
//    manager_id INT REFERENCES employees(employee_id),  -- Link to the employee who manages the department
//        location VARCHAR(255)  -- Where the department operates from
//        );
