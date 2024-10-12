package com.company.erp_modules.sale.model.entity;


import com.company.erp_modules.sale.model.entity.statics.PaymentMethods;

public class PhysicalOrders extends Orders {

    private Integer cashier_id;//employee_id
    private Integer branch_id;//store_id
    private Integer store_location;
    private PaymentMethods payment_method ;

    public PhysicalOrders(Integer cashier_id, Integer branch_id, Integer store_location, PaymentMethods payment_method) {
        this.cashier_id = cashier_id;
        this.branch_id = branch_id;
        this.store_location = store_location;
        this.payment_method = payment_method;
    }

    public Integer getCashier_id() {
        return cashier_id;
    }

    public void setCashier_id(Integer cashier_id) {
        this.cashier_id = cashier_id;
    }

    public Integer getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(Integer branch_id) {
        this.branch_id = branch_id;
    }

    public Integer getStore_location() {
        return store_location;
    }

    public void setStore_location(Integer store_location) {
        this.store_location = store_location;
    }

    public PaymentMethods getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(PaymentMethods payment_method) {
        this.payment_method = payment_method;
    }
}
