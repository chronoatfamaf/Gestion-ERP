package com.gestion.erp.models.Item;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
public class ItemCategory {
    @Id private Integer id;
    private String name;
    private Set<Item> categoryItems;
}
