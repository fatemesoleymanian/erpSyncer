package com.company.erp_modules.sale.model.entity;

import java.io.Serializable;
import java.math.BigInteger;

public class TerritoriesEntity implements Serializable {
    private BigInteger id;
    private Integer region_id;
    private String description;

    public TerritoriesEntity(BigInteger id, Integer region_d, String description) {
        this.id = id;
        this.region_id = region_d;
        this.description = description;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Integer getRegion_d() {
        return region_id;
    }

    public void setRegion_d(Integer region_d) {
        this.region_id = region_d;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
