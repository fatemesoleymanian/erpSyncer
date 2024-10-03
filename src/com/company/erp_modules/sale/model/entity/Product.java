package com.company.erp_modules.sale.model.entity;

import java.util.Date;
import java.util.UUID;

public class Product {
    private UUID id;
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


    public void createProduct (){

    }
    public void showProduct (int id){

    }
    public void showManyProducts (){

    }
    public void updateProduct (int id){

    }
    public void updateManyProducts (){

    }
    public void deleteProduct (int id){

    }
    public void deleteManyProducts (){

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