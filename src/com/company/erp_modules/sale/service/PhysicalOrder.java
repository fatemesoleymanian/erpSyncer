package com.company.erp_modules.sale.service;

import com.company.erp_modules.sale.service.statics.PaymentMethods;

public class PhysicalOrder extends Order {

    private Integer cashier_id;//employee_id
    private Integer branch_id;//store_id
    private Integer store_location;
    private PaymentMethods payment_method ;
}
