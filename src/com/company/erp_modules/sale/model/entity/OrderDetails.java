package com.company.erp_modules.sale.model.entity;

import java.util.UUID;

public class OrderDetails {
    private UUID id;
    private Integer order_id;
    private String order_number;
    private Integer product_id;
    private String product_name;
    private Integer qty;
    private String unit_price;
    private Integer discount;
    private String total_price;

    public void setTotal_price(String total_price) {
        this.total_price = String.valueOf((Integer.parseInt(this.unit_price) * this.qty * (100 - this.discount)) / 100);
    }

    public OrderDetails(UUID id, Integer order_id, Integer product_id, Integer qty, String unit_price, Integer discount, String total_price) {
        this.id = id;
        this.order_id = order_id;
        this.product_id = product_id;
        this.qty = qty;
        this.unit_price = unit_price;
        this.discount = discount;
        this.total_price = total_price;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(String unit_price) {
        this.unit_price = unit_price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getTotal_price() {
        return total_price;
    }
}

//    CREATE TABLE order_lines (
//        order_line_id SERIAL PRIMARY KEY,
//        order_id INT REFERENCES sales_orders(order_id) ON DELETE CASCADE,
//    product_id INT REFERENCES products(product_id) ON DELETE CASCADE,
//    quantity INTEGER NOT NULL CHECK (quantity > 0),
//    price NUMERIC(10, 2) NOT NULL,
//    line_total NUMERIC(10, 2) GENERATED ALWAYS AS (quantity * price) STORED
//        );
