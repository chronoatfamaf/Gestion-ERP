package com.gestion.erp.controllers;

import com.gestion.erp.services.OrderService;
import com.gestion.erp.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class OrderController {
    @Autowired protected PersonService personService;
    @Autowired protected OrderService orderService;
}
