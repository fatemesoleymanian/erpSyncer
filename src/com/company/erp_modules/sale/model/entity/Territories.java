package com.company.erp_modules.sale.model.entity;

import java.util.UUID;

public class Territories {
    private UUID id;
    private Integer region_id;
    private String description;

    public Territories(UUID id, Integer region_d, String description) {
        this.id = id;
        this.region_id = region_d;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
