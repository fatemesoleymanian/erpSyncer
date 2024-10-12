package com.company.erp_modules.sale.model.entity;

import java.util.Date;
import java.util.UUID;

public class Categories {
    private UUID id;
    private String name;
    private String description;
    private String picture;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;

    public Categories(UUID id, String name, String description, String picture, Date created_at, Date updated_at, Date deleted_at) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.picture = picture;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Date getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Date deleted_at) {
        this.deleted_at = deleted_at;
    }
}

//    CREATE TABLE categories (
//        category_id SERIAL PRIMARY KEY,
//        category_name VARCHAR(255) NOT NULL UNIQUE,
//    description TEXT
//);
