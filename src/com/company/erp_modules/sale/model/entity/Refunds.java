package com.company.erp_modules.sale.model.entity;

import java.util.Date;
import java.util.UUID;

public class Refunds {
    private UUID id;
    private Integer order_id;
    private Integer invoice_id;
    private Integer payment_id;
    private String reason;
    private String text;
    private String email;
    private Date created_at;

    public Refunds(UUID id, Integer order_id, Integer invoice_id, Integer payment_id, String reason, String text, String email, Date created_at) {
        this.id = id;
        this.order_id = order_id;
        this.invoice_id = invoice_id;
        this.payment_id = payment_id;
        this.reason = reason;
        this.text = text;
        this.email = email;
        this.created_at = created_at;
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

    public Integer getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Integer payment_id) {
        this.payment_id = payment_id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}

