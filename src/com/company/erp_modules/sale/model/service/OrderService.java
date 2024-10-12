package com.company.erp_modules.sale.model.service;

import com.company.erp_modules.sale.model.repository.OrderRepository;

import java.util.UUID;

public class OrderService {

    private OrderRepository orderRepository;

    public void index(){
        this.orderRepository.findAll();
    }
    //return specifics
    public void show(){
        this.orderRepository.findMany();
    }
    public void store(){
        this.orderRepository.save();
    }
    public void edit(){
        this.orderRepository.update();
    }
    public void editStatus(){
        this.orderRepository.update();
    }
    public void destroy(){
        this.orderRepository.delete();
    }
    private void getTotalPrice(){

    }
    public void getOrderDetails(UUID id){

    }
}
