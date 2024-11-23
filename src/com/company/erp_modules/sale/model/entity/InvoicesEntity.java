package com.company.erp_modules.sale.model.entity;


import com.company.erp_modules.sale.model.entity.statics.InvoiceStatus;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class InvoicesEntity implements Serializable {
    private BigInteger id;
    private Integer order_id;
    private String total_amount;
    private InvoiceStatus invoice_status;
    private Date created_at;
    private Date updated_at;

    public InvoicesEntity(BigInteger id, Integer order_id, String total_amount, InvoiceStatus invoice_status, Date created_at, Date updated_at) {
        this.id = id;
        this.order_id = order_id;
        this.total_amount = total_amount;
        this.invoice_status = invoice_status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public InvoiceStatus getInvoice_status() {
        return invoice_status;
    }

    public void setInvoice_status(InvoiceStatus invoice_status) {
        this.invoice_status = invoice_status;
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
}

//    CREATE TABLE invoices (
//        invoice_id SERIAL PRIMARY KEY,
//        order_id INT REFERENCES sales_orders(order_id) ON DELETE CASCADE,
//    invoice_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
//    invoice_status VARCHAR(50) CHECK (invoice_status IN ('Unpaid', 'Paid', 'Overdue')) NOT NULL,
//        due_date TIMESTAMP NOT NULL,
//        total_amount NUMERIC(10, 2) NOT NULL
//        );

