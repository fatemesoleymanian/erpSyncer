package com.company.erp_modules.sale.model.entity;

import java.util.UUID;

public class Departments {
    private UUID id;
    private String name;
    private Integer manager_id;
    private String location;


    /** basic CRUD functions **/
}
//    CREATE TABLE departments (
//        department_id SERIAL PRIMARY KEY,
//        department_name VARCHAR(255) NOT NULL,
//    manager_id INT REFERENCES employees(employee_id),  -- Link to the employee who manages the department
//        location VARCHAR(255)  -- Where the department operates from
//        );
