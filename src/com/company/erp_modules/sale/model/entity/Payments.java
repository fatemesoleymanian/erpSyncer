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

    public Payments(UUID id, Integer order_id, Integer invoice_id, PaymentMethods payment_method, String amount, PaymentStatus payment_status, Date created_at, Date updated_at) {
        this.id = id;
        this.order_id = order_id;
        this.invoice_id = invoice_id;
        this.payment_method = payment_method;
        this.amount = amount;
        this.payment_status = payment_status;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public Integer getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Integer invoice_id) {
        this.invoice_id = invoice_id;
    }

    public PaymentMethods getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(PaymentMethods payment_method) {
        this.payment_method = payment_method;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public PaymentStatus getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(PaymentStatus payment_status) {
        this.payment_status = payment_status;
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

//    CREATE TABLE payments (
//        payment_id SERIAL PRIMARY KEY,
//        order_id INT REFERENCES orders(order_id) ON DELETE CASCADE,
//    payment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
//    payment_method VARCHAR(50) CHECK (payment_method IN ('Credit Card', 'Bank Transfer', 'Cash', 'Mobile Payment', 'PayPal')),
//        amount NUMERIC(10, 2) NOT NULL,
//        payment_status VARCHAR(50) CHECK (payment_status IN ('Completed', 'Pending', 'Failed')) NOT NULL
//        );
