package com.bilichenko.gpucashdemo.controller;

import com.bilichenko.gpucashdemo.model.Order;
import com.bilichenko.gpucashdemo.model.Status;
import com.bilichenko.gpucashdemo.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/orders")
@CrossOrigin("http://localhost:4200")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> get(@RequestParam(name = "status", required = false) Status status) {
        return orderService.getByOptionalStatus(status);
    }

    @PostMapping
    public Order add(@RequestBody Order order) {
        return orderService.add(order);
    }

}
