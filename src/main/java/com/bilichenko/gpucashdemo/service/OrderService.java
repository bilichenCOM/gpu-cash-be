package com.bilichenko.gpucashdemo.service;

import com.bilichenko.gpucashdemo.model.Order;
import com.bilichenko.gpucashdemo.model.Status;
import com.bilichenko.gpucashdemo.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<Order> getByStatuses(List<Status> statuses) {
        return orderRepository.findAllByStatusIn(statuses);
    }

    public Order update(Order order) {
        return orderRepository.save(order);
    }

    public Optional<Order> getById(Long id) {
        return orderRepository.findById(id);
    }
}
