package com.gestion.erp.models.Payment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
public class Payment {
    @Id private Integer id;
    private BigDecimal amount;
    private PaymentType paymentType;
}
