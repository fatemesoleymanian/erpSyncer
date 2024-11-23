package com.company.erp_modules.sale.model.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class RefundsEntity implements Serializable {
    private BigInteger id;
    private Integer order_id;
    private Integer invoice_id;
    private Integer payment_id;
    private String reason;
    private String text;
    private String email;
    private Date created_at;

    public RefundsEntity(BigInteger id, Integer order_id, Integer invoice_id, Integer payment_id, String reason, String text, String email, Date created_at) {
        this.id = id;
        this.order_id = order_id;
        this.invoice_id = invoice_id;
        this.payment_id = payment_id;
        this.reason = reason;
        this.text = text;
        this.email = email;
        this.created_at = created_at;
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

