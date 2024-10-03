package com.company.erp_modules.sale.model.repository;


import com.company.erp_modules.sale.model.entity.Customers;

import java.util.List;

public class CustomersRepository {

    public Customers createCustomer (Customers customer){
        //save into db
        return customer;
    }
    public Customers updateCustomer (Customers customer){
        // update customer in db
        return customer;
    }
    public List<Customers> updateManyCustomers (List<Customers> customers){
        //find customers and update them
        return customers;
    }
    public void deleteCustomer (Customers customer){
        // delete customer in db
    }
    public void deleteManyCustomers (List<Customers> customers){
        //find customers and delete0 them
    }
    public Customers showCustomer (Customers customer){
        // find customer in db
        return customer;
    }
    public List<Customers> showManyCustomers (List<Customers> customers){
        //find customers to return
        return customers;
    }
}
