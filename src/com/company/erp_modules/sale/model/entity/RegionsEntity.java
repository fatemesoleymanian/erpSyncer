package com.company.erp_modules.sale.model.entity;

import java.io.Serializable;
import java.math.BigInteger;

public class RegionsEntity implements Serializable {
    private BigInteger id;
    private String description;

    public RegionsEntity(BigInteger id, String description) {
        this.id = id;
        this.description = description;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
