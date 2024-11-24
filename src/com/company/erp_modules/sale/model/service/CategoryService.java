package com.company.erp_modules.sale.model.service;

import com.company.erp_modules.sale.model.repository.CategoryRepository;

public class CategoryService {

    private CategoryRepository categoryRepository;

    //return all
    public void find(){
        this.categoryRepository.selectAll();

    }
    //return specifics
//    public void find(){
//        this.categoryRepository.findMany();
//    }
    public void save(){
        this.categoryRepository.insert();
    }
//    public void change(){
//        this.categoryRepository.update();
//    }
//    public void remove(){
//        this.categoryRepository.delete();
//    }
}
