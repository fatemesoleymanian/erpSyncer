package com.company.erp_modules.sale.service;

import com.company.erp_modules.sale.service.statics.InvoiceStatus;

import java.util.Date;

public class Invoices {
    private Integer id;
    private Integer order_id;
    private String total_amount;
    private InvoiceStatus invoice_status;
    private Date created_at;
    private Date updated_at;

}

//    CREATE TABLE invoices (
//        invoice_id SERIAL PRIMARY KEY,
//        order_id INT REFERENCES sales_orders(order_id) ON DELETE CASCADE,
//    invoice_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
//    invoice_status VARCHAR(50) CHECK (invoice_status IN ('Unpaid', 'Paid', 'Overdue')) NOT NULL,
//        due_date TIMESTAMP NOT NULL,
//        total_amount NUMERIC(10, 2) NOT NULL
//        );

