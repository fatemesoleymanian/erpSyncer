package com.company.erp_modules.sale.model.service;

import com.company.erp_modules.sale.model.repository.CategoryRepository;

public class CategoryService {

    private CategoryRepository categoryRepository;

    //return all
    public void index(){
        this.categoryRepository.findAll();

    }
    //return specifics
//    public void show(){
//        this.categoryRepository.findMany();
//    }
    public void store(){
        this.categoryRepository.save();
    }
//    public void edit(){
//        this.categoryRepository.update();
//    }
//    public void destroy(){
//        this.categoryRepository.delete();
//    }
}
