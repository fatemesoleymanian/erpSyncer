package com.company.erp_modules.sale.service;

import com.company.erp_modules.sale.service.statics.OrderStatus;
import com.company.erp_modules.sale.service.statics.PaymentStatus;

import java.util.Date;

public abstract class Order {
    private int id;
    private String totalPrice;
    private String type;//online - in person
    private int discount;
    private String freight;//how much it costs to transferring be done
    private String shipping_address;
    private String billing_address;
    private OrderStatus status;
    private PaymentStatus payment_status;
    private String charge_id;

    /**RELATIONS **/
    private int invoice_id;
    private int costumer_id;
    private Date created_at;
    private Date updated_at;



//    CREATE TABLE sales_orders (
//     order_id SERIAL PRIMARY KEY,
//    customer_id INT REFERENCES customers(customer_id) ON DELETE CASCADE,
//    order_status VARCHAR(50) CHECK (order_status IN ('Pending', 'Confirmed', 'Shipped', 'Delivered', 'Cancelled')) NOT NULL,
//    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
//    total_amount NUMERIC(10, 2) NOT NULL,
//    shipping_address TEXT,
//    billing_address TEXT,
//    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
//            );





}