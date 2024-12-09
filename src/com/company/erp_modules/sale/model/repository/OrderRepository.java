package com.company.erp_modules.sale.model.repository;

import com.company.erp_modules.sale.model.entity.OrdersEntity;
import com.company.smartbrain.tools.database.connection.ConnectionManagement;

import java.util.List;
import java.util.UUID;

public class OrderRepository {
    private ConnectionManagement connection;
    private OrdersEntity orders;
    public OrderRepository(){
        connection = new ConnectionManagement();
        connection.connectionListener();
    }

    public void insert(){

    }
    public void select(UUID id){

    }
    public void selectMany(List<UUID> ids){

    }
    public void selectAll(){

    }
    public void update(UUID id, OrdersEntity order) {

    }

    public void delete(Boolean soft, UUID id){

    }
    public void deleteMany(Boolean soft, List<UUID> ids){

    }
    public void deleteAll(Boolean soft){

    }
}
