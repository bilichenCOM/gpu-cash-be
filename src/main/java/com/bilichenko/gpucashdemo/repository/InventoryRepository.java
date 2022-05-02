package com.bilichenko.gpucashdemo.repository;

import com.bilichenko.gpucashdemo.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
