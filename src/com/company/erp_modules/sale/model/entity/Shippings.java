package com.company.erp_modules.sale.model.entity;


import com.company.erp_modules.sale.model.entity.statics.ShippingMethods;

import java.util.Date;
import java.util.UUID;

public class Shippings {
    private Integer id;
    private UUID order_id;
    private Integer shipper_id;
    private ShippingMethods shipping_method;
    private String tracking_number;
    private Date shipped_date;
    private Date deliver_date;
    private Date required_date;

    public Shippings(Integer id, UUID order_id, Integer shipper_id, ShippingMethods shipping_method, String tracking_number, Date shipped_date, Date deliver_date, Date required_date) {
        this.id = id;
        this.order_id = order_id;
        this.shipper_id = shipper_id;
        this.shipping_method = shipping_method;
        this.tracking_number = tracking_number;
        this.shipped_date = shipped_date;
        this.deliver_date = deliver_date;
        this.required_date = required_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UUID getOrder_id() {
        return order_id;
    }

    public void setOrder_id(UUID order_id) {
        this.order_id = order_id;
    }

    public Integer getShipper_id() {
        return shipper_id;
    }

    public void setShipper_id(Integer shipper_id) {
        this.shipper_id = shipper_id;
    }

    public ShippingMethods getShipping_method() {
        return shipping_method;
    }

    public void setShipping_method(ShippingMethods shipping_method) {
        this.shipping_method = shipping_method;
    }

    public String getTracking_number() {
        return tracking_number;
    }

    public void setTracking_number(String tracking_number) {
        this.tracking_number = tracking_number;
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
}
