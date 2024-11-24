package com.company.erp_modules.sale.model.service;

import com.company.erp_modules.sale.model.repository.CustomersRepository;

public class CustomerService {

   private CustomersRepository customersRepository;

    public void findAll(){
        this.customersRepository.selectAll();

    }
    //return specifics
    public void find(){
//        this.customersRepository.findMany();
    }
    public void save(){
//        this.customersRepository.save();
    }
    public void change(){
//        this.customersRepository.update();
    }
    public void remove(){
//        this.customersRepository.delete();
    }
}
