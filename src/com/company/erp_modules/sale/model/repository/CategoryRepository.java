package com.company.erp_modules.sale.model.repository;


import com.company.erp_modules.sale.model.entity.CategoriesEntity;
import com.company.smartbrain.tools.database.connection.ConnectionManagement;

import java.util.List;
import java.util.UUID;

public class CategoryRepository {
    private ConnectionManagement connection;
    public CategoryRepository(){
        connection = new ConnectionManagement();
        connection.connectionListener();
    }

    private CategoriesEntity categories;
    public void insert(){

    }
    public void select(UUID id){

    }
    public void selectMany(List<UUID> ids){

    }
    public void selectAll(){

    }
    public void update(UUID id){

    }
    public void updateMany(List<UUID> ids, CategoriesEntity category){

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
