package com.company.erp_modules.sale.model.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class OnlineOrdersEntity extends OrdersEntity implements Serializable {
    private Date shipped_date;
    private Date deliver_date;
    private Date required_date;
    private String ip_address;
    private String payment_gateway;//-- e.g., PayPal, Stripe
    private BigInteger basket_id;
    private BigInteger transaction_id;
    private BigInteger ship_id;

    public OnlineOrdersEntity(Date shipped_date, Date deliver_date, Date required_date, String ip_address, String payment_gateway, BigInteger basket_id, BigInteger transaction_id, BigInteger ship_id) {
        this.shipped_date = shipped_date;
        this.deliver_date = deliver_date;
        this.required_date = required_date;
        this.ip_address = ip_address;
        this.payment_gateway = payment_gateway;
        this.basket_id = basket_id;
        this.transaction_id = transaction_id;
        this.ship_id = ship_id;
    }

    public Date getShipped_date() {
        return shipped_date;
    }

    public void setShipped_date(Date shipped_date) {
        this.shipped_date = shipped_date;
    }

    public Date getDeliver_date() {
        return deliver_date;
    }

    public void setDeliver_date(Date deliver_date) {
        this.deliver_date = deliver_date;
    }

    public Date getRequired_date() {
        return required_date;
    }

    public void setRequired_date(Date required_date) {
        this.required_date = required_date;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getPayment_gateway() {
        return payment_gateway;
    }

    public void setPayment_gateway(String payment_gateway) {
        this.payment_gateway = payment_gateway;
    }

    public BigInteger getBasket_id() {
        return basket_id;
    }

    public void setBasket_id(BigInteger basket_id) {
        this.basket_id = basket_id;
    }

    public BigInteger getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(BigInteger transaction_id) {
        this.transaction_id = transaction_id;
    }

    public BigInteger getShip_id() {
        return ship_id;
    }

    public void setShip_id(BigInteger ship_id) {
        this.ship_id = ship_id;
    }
}
