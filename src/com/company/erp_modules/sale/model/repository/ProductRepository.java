package com.company.erp_modules.sale.model.repository;

import com.company.erp_modules.sale.model.entity.ProductsEntity;
import com.company.smartbrain.tools.database.connection.ConnectionManagement;

import java.util.List;
import java.util.UUID;

public class ProductRepository {
    private ConnectionManagement connection;

    private ProductsEntity product;
    public ProductRepository(){
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
    public void update(UUID id, ProductsEntity product){

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
    public void addUnitsInStock(UUID id ,int count) {

    }
    public void removeUnitsInStock(UUID id ,int count) {

    }
}
