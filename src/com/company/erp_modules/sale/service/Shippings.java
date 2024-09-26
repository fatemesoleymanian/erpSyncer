package com.company.erp_modules.sale.service;

import com.company.erp_modules.sale.service.statics.ShippingMethods;

import java.util.Date;

public class Shippings {
    private Integer id;
    private Integer order_id;
    private Integer shipper_id;
    private ShippingMethods shipping_method;
    private String tracking_number;
    private Date shipped_date;
    private Date deliver_date;
    private Date required_date;
}
