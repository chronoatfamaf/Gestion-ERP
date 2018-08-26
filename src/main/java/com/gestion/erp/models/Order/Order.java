package com.gestion.erp.models.Order;

import com.gestion.erp.models.Address.Address;
import com.gestion.erp.models.Item.Item;
import com.gestion.erp.models.Payment.Payment;
import com.gestion.erp.models.Person.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    private Integer id;
    private String orderNumber;
    private Set<Item> orderItems;
    private Address deliveryAddress;
    private Address billingAddress;
    private Payment payment;
    private OrderStatus orderStatus;
    private Person person;
}
