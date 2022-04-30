package com.bilichenko.gpucashdemo.service;

import com.bilichenko.gpucashdemo.model.Order;
import com.bilichenko.gpucashdemo.model.Status;
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

    public Order add(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getByOptionalStatus(Status status) {
        if (status == null) {
            return getAll();
        }
        return getByStatus(status);
    }

    private List<Order> getByStatus(Status status) {
        return orderRepository.findByStatus(status);
    }

    public Order update(Order order) {
        return orderRepository.save(order);
    }
}
