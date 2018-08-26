package com.gestion.erp.services;

import com.gestion.erp.models.Order.Order;
import com.gestion.erp.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderService {
    @Autowired OrderRepository orderRepository;

    public Order createOrder(Order order){
        order.setOrderNumber(String.valueOf(System.currentTimeMillis()));
        return orderRepository.save(order);
    }

    public Order getOrder(String orderNumber){
        return orderRepository.findOrderByOrderNumber(orderNumber);
    }
}
