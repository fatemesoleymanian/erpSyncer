package com.company.erp_modules.sale.model.entity;



import com.company.erp_modules.sale.model.entity.statics.PaymentMethods;
import com.company.erp_modules.sale.model.entity.statics.PaymentStatus;

import java.util.Date;
import java.util.UUID;

public class Payments {
    private UUID id;
    private Integer order_id;
    private Integer invoice_id;
    private PaymentMethods payment_method;
    private String amount;
    private PaymentStatus payment_status;
    private Date created_at;
    private Date updated_at;
}

//    CREATE TABLE payments (
//        payment_id SERIAL PRIMARY KEY,
//        order_id INT REFERENCES orders(order_id) ON DELETE CASCADE,
//    payment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
//    payment_method VARCHAR(50) CHECK (payment_method IN ('Credit Card', 'Bank Transfer', 'Cash', 'Mobile Payment', 'PayPal')),
//        amount NUMERIC(10, 2) NOT NULL,
//        payment_status VARCHAR(50) CHECK (payment_status IN ('Completed', 'Pending', 'Failed')) NOT NULL
//        );
