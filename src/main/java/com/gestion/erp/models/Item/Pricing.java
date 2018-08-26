package com.gestion.erp.models.Item;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
public class Pricing {
    private BigDecimal subTotal;
    private BigDecimal tax;
    private BigDecimal total;
    private BigDecimal commission;
    private BigDecimal listPrice;
}
