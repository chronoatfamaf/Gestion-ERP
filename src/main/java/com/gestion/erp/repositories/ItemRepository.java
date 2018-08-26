package com.gestion.erp.repositories;

import com.gestion.erp.models.Item.Item;
import com.gestion.erp.models.Item.ItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item> findItemsByItemCategory(ItemCategory itemCategory);
    Item findItemByItemCategory(ItemCategory itemCategory);
    Item findItemByItemCode(String itemCode);
}
