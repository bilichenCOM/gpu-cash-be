package com.bilichenko.gpucashdemo.controller;

import com.bilichenko.gpucashdemo.model.Inventory;
import com.bilichenko.gpucashdemo.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventories")
@CrossOrigin("http://localhost:4200")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping
    public Inventory add(@RequestBody Inventory inventory) {
        return inventoryService.add(inventory);
    }

    @GetMapping
    public List<Inventory> getAll() {
        return inventoryService.getAll();
    }
}
