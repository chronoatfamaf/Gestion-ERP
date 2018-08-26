package com.gestion.erp.models.Order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class OrderStatus {
    private String orderShipped = "SHIPPED";
    private String orderPended = "PENDED";
    private String orderInProcess = "IN PROCESS";
    private String orderProcessed = "PROCESSED";
}
