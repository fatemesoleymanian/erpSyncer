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
}
