package com.bilichenko.gpucashdemo.service;

import com.bilichenko.gpucashdemo.model.Vendor;
import com.bilichenko.gpucashdemo.repository.VendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendorService {

    private final VendorRepository vendorRepository;

    public VendorService(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    public List<Vendor> getAll() {
        return vendorRepository.findAll();
    }

    public Vendor add(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    public Optional<Vendor> getById(Long id) {
        return vendorRepository.findById(id);
    }

    public Vendor update(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    public void delete(Vendor vendor) {
        vendorRepository.delete(vendor);
    }
}
