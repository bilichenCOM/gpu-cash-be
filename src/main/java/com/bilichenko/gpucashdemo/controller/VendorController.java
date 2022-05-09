package com.bilichenko.gpucashdemo.controller;

import com.bilichenko.gpucashdemo.model.Vendor;
import com.bilichenko.gpucashdemo.model.VendorType;
import com.bilichenko.gpucashdemo.service.VendorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
    public List<Vendor> getAll(@RequestParam(required = false) VendorType type) {
        return vendorService.getAllByOptionalType(type);
    }

    @PostMapping
    public Vendor add(@RequestBody Vendor vendor) {
        return vendorService.add(vendor);
    }

    @GetMapping("/{id}")
    public Vendor getById(@PathVariable Long id) {
        return vendorService.getById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping
    public Vendor update(@RequestBody Vendor vendor) {
        return vendorService.update(vendor);
    }

    @DeleteMapping
    public void delete(@RequestBody Vendor vendor) {
        vendorService.delete(vendor);
    }
}
