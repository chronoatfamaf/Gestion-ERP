package com.gestion.erp.models.Address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
public class Address {
    @Id private Integer id;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
