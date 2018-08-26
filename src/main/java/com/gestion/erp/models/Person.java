package com.gestion.erp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private String description;
    private Integer age;
    private Address address;
    private Boolean activeStatus;
}
