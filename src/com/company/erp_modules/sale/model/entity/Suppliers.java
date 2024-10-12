package com.company.erp_modules.sale.model.entity;

import java.util.UUID;

public class Suppliers {
    private UUID id;
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

    public Suppliers(UUID id, String company_name, String contact_name, String phone, String email, String address, String region, String city, String postal_code, String country, String fax, String home_page, Boolean status) {
        this.id = id;
        this.company_name = company_name;
        this.contact_name = contact_name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.region = region;
        this.city = city;
        this.postal_code = postal_code;
        this.country = country;
        this.fax = fax;
        this.home_page = home_page;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getHome_page() {
        return home_page;
    }

    public void setHome_page(String home_page) {
        this.home_page = home_page;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
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

