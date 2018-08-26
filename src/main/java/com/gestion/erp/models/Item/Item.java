package com.gestion.erp.models.Item;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
public class Item {
    @Id private Integer id;
    private String itemCode;
    private String name;
    private String description;
    private ItemCategory itemCategory;
    private Pricing pricing;
    private Integer quantity;
}
