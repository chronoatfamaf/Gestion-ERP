package com.gestion.erp.repositories;

import com.gestion.erp.models.Order.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Integer> {
    Order findOrderById(Integer orderId);
    Order findOrderByOrderNumber(String orderNumber);
}
