package com.company.erp_modules.sale.model.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class ProductsEntity implements Serializable {
    private BigInteger id;
    private String name;
    private String code;
    private String slug;
    private String description;

    //Specifies the quantity of the product contained in one unit (or package). If you sell a pack of 12 cans of soda, quantityperunit could be "12 cans" or if you sell in bulk, it could be "100 grams"
    private String quantity_per_unit;

    // This is the base price customers will pay per unit
    private String unit_price;

    //Tracks how many units of the product are currently available in the inventory
    private Integer units_in_stock;

    //Indicates how many units of the product are currently on order (but not yet received)
    private String units_on_order;

    //If the reorder level for soda packs is set to 20, it means when the stock goes below 20 units, you should consider reordering.
    private Integer reorder_level;

    //Indicates whether the product is still available for sale or has been discontinued. If a specific soda brand is no longer being produced or sold, the discontinued field would be set to TRUE.
    private Boolean discontinued;

    /** RELATIONS **/
    private Integer supplier_id;
    private Integer category_id;

    private Date created_at;
    private Date updated_at;
    private Date deleted_at;


    public ProductsEntity(BigInteger id, String name, String code, String slug, String description, String quantity_per_unit, String unit_price, Integer units_in_stock, String units_on_order, Integer reorder_level, Boolean discontinued, Integer supplier_id, Integer category_id, Date created_at, Date updated_at, Date deleted_at) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.slug = slug;
        this.description = description;
        this.quantity_per_unit = quantity_per_unit;
        this.unit_price = unit_price;
        this.units_in_stock = units_in_stock;
        this.units_on_order = units_on_order;
        this.reorder_level = reorder_level;
        this.discontinued = discontinued;
        this.supplier_id = supplier_id;
        this.category_id = category_id;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuantity_per_unit() {
        return quantity_per_unit;
    }

    public void setQuantity_per_unit(String quantity_per_unit) {
        this.quantity_per_unit = quantity_per_unit;
    }

    public String getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(String unit_price) {
        this.unit_price = unit_price;
    }

    public Integer getUnits_in_stock() {
        return units_in_stock;
    }

    public void setUnits_in_stock(Integer units_in_stock) {
        this.units_in_stock = units_in_stock;
    }

    public String getUnits_on_order() {
        return units_on_order;
    }

    public void setUnits_on_order(String units_on_order) {
        this.units_on_order = units_on_order;
    }

    public Integer getReorder_level() {
        return reorder_level;
    }

    public void setReorder_level(Integer reorder_level) {
        this.reorder_level = reorder_level;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
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

//    CREATE TABLE products (
//        product_id SERIAL PRIMARY KEY,
//        product_name VARCHAR(255) NOT NULL,
//    product_code VARCHAR(50) UNIQUE NOT NULL,
//    description TEXT,
//    price NUMERIC(10, 2) NOT NULL,
//    stock_quantity INTEGER NOT NULL DEFAULT 0,
//        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
//        );

/** How These Fields Work Together:
 Stock Management: unitsinstock, unitsonorder, and reorderlevel allow you to efficiently manage inventory levels. When unitsinstock falls below the reorderlevel, you place new orders, and the unitsonorder field tracks incoming stock.
 Discontinuation: The discontinued flag ensures that a product no longer available for sale remains in your records, but it won’t appear in new orders or listings.
 Pricing: unitprice combined with quantityperunit helps customers understand both the per-unit price and how much product they are getting in each unit.
 **/