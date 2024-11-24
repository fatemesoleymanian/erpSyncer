package com.company.erp_modules.sale.model.service;

import com.company.erp_modules.sale.model.repository.OrderRepository;

import java.util.UUID;

public class OrderService {

    private OrderRepository orderRepository;

    public void findAll(){
        this.orderRepository.selectAll();
    }
    //return specifics
    public void find(){
//        this.orderRepository.findMany();
    }
    public void save(){
        this.orderRepository.insert();
    }
    public void change(){
//        this.orderRepository.update();
    }
    public void changeStatus(){
//        this.orderRepository.update();
    }
    public void remove(){
//        this.orderRepository.delete();
    }
    private void getTotalPrice(){

    }
    public void getOrderDetails(UUID id){

    }
}
