package com.company.erp_modules.sale.service;

public class OrderDetails {
    private Integer id;
    private Integer order_id;
    private Integer product_id;
    private Integer qty;
    private String unit_price;
    private Integer discount;
    private String total_price;

    public void setTotal_price(String total_price) {
        this.total_price = String.valueOf((Integer.parseInt(this.unit_price) * this.qty * (100 - this.discount)) / 100);
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
