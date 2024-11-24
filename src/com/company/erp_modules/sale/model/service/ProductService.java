package com.company.erp_modules.sale.model.service;

import com.company.erp_modules.sale.model.repository.ProductAttributeRepository;
import com.company.erp_modules.sale.model.repository.ProductRepository;

public class ProductService {
    private ProductRepository productRepository;
    private ProductAttributeRepository productAttributeRepository;

    public void findAll(){
        this.productRepository.selectAll();
    }
    //return specifics like products in a category
    public void find(String parameter ,String value){
//        this.productRepository.findMany();
    }
    public void save(){
        this.productRepository.insert();
    }
    public void change(){
//        this.productRepository.update();
    }
    public void remove(){
//        this.productRepository.delete();
    }
}
