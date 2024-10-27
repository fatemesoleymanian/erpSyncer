package com.company.erp_modules.sale.model.service;

import com.company.erp_modules.sale.model.repository.CustomersRepository;

public class CustomerService {

   private CustomersRepository customersRepository;

    public void index(){
        this.customersRepository.findAll();

    }
    //return specifics
    public void show(){
//        this.customersRepository.findMany();
    }
    public void store(){
//        this.customersRepository.save();
    }
    public void edit(){
//        this.customersRepository.update();
    }
    public void destroy(){
//        this.customersRepository.delete();
    }
}
