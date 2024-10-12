package com.company.erp_modules.sale.model.service;

import com.company.erp_modules.sale.model.repository.ProductAttributeRepository;
import com.company.erp_modules.sale.model.repository.ProductRepository;

public class ProductService {
    private ProductRepository productRepository;
    private ProductAttributeRepository productAttributeRepository;

    public void index(){
        this.productRepository.findAll();
    }
    //return specifics like products in a category
    public void show(String parameter ,String value){
        this.productRepository.findMany();
    }
    public void store(){
        this.productRepository.save();
    }
    public void edit(){
        this.productRepository.update();
    }
    public void destroy(){
        this.productRepository.delete();
    }
}
