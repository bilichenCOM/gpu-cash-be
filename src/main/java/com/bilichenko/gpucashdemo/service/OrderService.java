package com.bilichenko.gpucashdemo.service;

import com.bilichenko.gpucashdemo.model.Order;
import com.bilichenko.gpucashdemo.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAll() {
        return orderRepository.findAll();
    }
}
