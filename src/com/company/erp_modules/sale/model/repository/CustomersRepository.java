package com.company.erp_modules.sale.model.repository;


import com.company.erp_modules.sale.model.entity.CustomersEntity;
import com.company.smartbrain.tools.database.connection.ConnectionManagement;

import java.util.List;
import java.util.UUID;

public class CustomersRepository {
    private ConnectionManagement connection;

    public CustomersRepository(){
        connection = new ConnectionManagement();
        connection.connectionListener();
    }

    private CustomersEntity customer;
    public void insert(){

    }
    public void select(UUID id){

    }
    public void selectMany(List<UUID> ids){

    }
    public void selectAll(){

    }
    public void update(UUID id, CustomersEntity customer){

    }
    public void updateMany(List<UUID> ids){

    }
    public void updateAll(){

    }
    public void delete(Boolean soft, UUID id){

    }
    public void deleteMany(Boolean soft, List<UUID> ids){

    }
    public void deleteAll(Boolean soft){

    }
}
