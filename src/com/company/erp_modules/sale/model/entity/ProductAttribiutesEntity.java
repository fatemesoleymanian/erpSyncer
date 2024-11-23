package com.company.erp_modules.sale.model.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class ProductAttribiutesEntity implements Serializable {
    private BigInteger id;
    private Integer product_id;
    private String name;
    private String type;
    private Boolean required;
    private String description;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;

    public ProductAttribiutesEntity(BigInteger id, Integer product_id, String name, String type, Boolean required, String description, Date created_at, Date updated_at, Date deleted_at) {
        this.id = id;
        this.product_id = product_id;
        this.name = name;
        this.type = type;
        this.required = required;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
