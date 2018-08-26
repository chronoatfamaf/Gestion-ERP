package com.gestion.erp.models.Person;

import com.gestion.erp.models.Address.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.Email;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id private Integer id;
    private String firstName;
    private String lastName;
    private String description;
    @Email private String emailAddress;
    private Integer age;
    private Address address;
    private Boolean activeStatus;
}
