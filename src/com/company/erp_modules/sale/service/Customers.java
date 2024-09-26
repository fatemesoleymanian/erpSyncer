package com.company.erp_modules.sale.service;

import java.util.Date;

public class Customers {
    private Integer id;
    private String first_name;
    private String last_name;
    private  String email_address;//unique
    private String phone_number;//unique
    private String fax;
    /** customer can have multiple addresses and be stored in address table too */
    private String billing_address; //The billing address is used for payment verification and invoicing. physical order
    private String shipping_address;//The shipping address is where the product is sent :: online order

    private String city;
    private String region;
    private String country;
    private String postal_code;
    private Date created_at;
    private Date updated_at;


}



//    CREATE TABLE customers (
//        customer_id SERIAL PRIMARY KEY,
//        customer_name VARCHAR(255) NOT NULL,
//    email VARCHAR(255) UNIQUE NOT NULL,
//    phone VARCHAR(20),
//    billing_address TEXT,
//    shipping_address TEXT,
//    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
//);
