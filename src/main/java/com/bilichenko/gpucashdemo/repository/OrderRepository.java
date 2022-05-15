package com.bilichenko.gpucashdemo.repository;

import com.bilichenko.gpucashdemo.model.Order;
import com.bilichenko.gpucashdemo.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByStatusIn(List<Status> statuses);
}
