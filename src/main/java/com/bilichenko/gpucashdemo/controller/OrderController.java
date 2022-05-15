package com.bilichenko.gpucashdemo.controller;

import com.bilichenko.gpucashdemo.model.Order;
import com.bilichenko.gpucashdemo.model.Status;
import com.bilichenko.gpucashdemo.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController()
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> get(@RequestParam(name = "statuses", required = false) List<Status> statuses) {
        return orderService.getByStatuses(statuses);
    }

    @PostMapping
    public Order add(@RequestBody Order order) {
        return orderService.add(order);
    }

    @PutMapping
    public Order update(@RequestBody Order order) {
        return orderService.update(order);
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable Long id) {
        return orderService.getById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
