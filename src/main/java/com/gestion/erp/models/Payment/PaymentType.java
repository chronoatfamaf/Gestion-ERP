package com.gestion.erp.models.Payment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
public class PaymentType {
    @Id private Integer id;
    private String cash = "CASH";
    private String creditCard = "CC";
    private String debitCard = "DB";
}
