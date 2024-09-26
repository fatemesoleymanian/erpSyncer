package com.company.erp_modules.sale.service;

public class Suppliers {
    private Integer id;
    private String company_name;
    private String contact_name;
    private String phone;
    private String email;
    private String address;
    private String region;
    private String city;
    private String postal_code;
    private String country;
    private String fax;
    private String home_page;
    private Boolean status;

}

//    CREATE TABLE suppliers (
//        supplier_id SERIAL PRIMARY KEY,
//        supplier_name VARCHAR(255) NOT NULL,
//    contact_name VARCHAR(255),
//    phone VARCHAR(20),
//    email VARCHAR(255),
//    address TEXT,
//    status VARCHAR(50) CHECK (status IN ('Active', 'Inactive'))  -- Supplier status
//        );

