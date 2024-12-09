package com.company.erp_modules.sale.model.repository;

import com.company.erp_modules.sale.model.entity.ProductAttribiutesEntity;
import com.company.smartbrain.tools.database.connection.ConnectionManagement;

import java.util.List;
import java.util.UUID;

public class ProductAttributeRepository {
    private ConnectionManagement connection;
    private ProductAttribiutesEntity productAttribiute;
    public ProductAttributeRepository(){
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
    public void update(UUID id, ProductAttribiutesEntity productAttribiute){

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
