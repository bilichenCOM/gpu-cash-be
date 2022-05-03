package com.bilichenko.gpucashdemo.service;

import com.bilichenko.gpucashdemo.model.Inventory;
import com.bilichenko.gpucashdemo.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public Inventory add(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public List<Inventory> getAll() {
        return inventoryRepository.findAll();
    }

    public Inventory update(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public void delete(Inventory inventory) {
        inventoryRepository.delete(inventory);
    }
}
