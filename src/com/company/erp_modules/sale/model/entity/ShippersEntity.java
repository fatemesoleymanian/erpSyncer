package com.company.erp_modules.sale.model.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class ShippersEntity implements Serializable {
    private BigInteger id;
    private String name;
    private String company_name;
    private String phone;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;

    public ShippersEntity(BigInteger id, String name, String company_name, String phone, Date created_at, Date updated_at, Date deleted_at) {
        this.id = id;
        this.name = name;
        this.company_name = company_name;
        this.phone = phone;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
