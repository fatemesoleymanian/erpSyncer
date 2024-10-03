package com.company.erp_modules.sale.model.entity;

import java.util.Date;

public class OnlineOrder extends Order {
    private Date shipped_date;
    private Date deliver_date;
    private Date required_date;
    private String ip_address;
    private String payment_gateway;//-- e.g., PayPal, Stripe
    private int basket_id;
    private int transaction_id;
    private int ship_id;

}
