package com.bilichenko.gpucashdemo.controller;

import com.bilichenko.gpucashdemo.model.Vendor;
import com.bilichenko.gpucashdemo.service.VendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendors")
@CrossOrigin("http://localhost:4200")
public class VendorController {

    private final VendorService vendorService;

    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping
    public List<Vendor> getAll() {
        return vendorService.getAll();
    }

    @PostMapping
    public Vendor add(@RequestBody Vendor vendor) {
        return vendorService.add(vendor);
    }
}
