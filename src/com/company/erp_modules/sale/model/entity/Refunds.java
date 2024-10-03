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

}
