package com.bilichenko.gpucashdemo.repository;

import com.bilichenko.gpucashdemo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
