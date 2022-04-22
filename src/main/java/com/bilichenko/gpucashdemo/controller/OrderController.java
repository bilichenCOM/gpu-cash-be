package com.bilichenko.gpucashdemo.controller;

import com.bilichenko.gpucashdemo.model.Order;
import com.bilichenko.gpucashdemo.service.OrderService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public List<Order> getAll() {
        return orderService.getAll();
    }

}
