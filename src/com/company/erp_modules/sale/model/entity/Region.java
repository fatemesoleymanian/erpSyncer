package com.company.erp_modules.sale.model.entity;

import java.util.UUID;

public class Region {
    private UUID id;
    private String description;

    public Region(UUID id, String description) {
        this.id = id;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
