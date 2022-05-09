package com.bilichenko.gpucashdemo.repository;

import com.bilichenko.gpucashdemo.model.Vendor;
import com.bilichenko.gpucashdemo.model.VendorType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendorRepository extends JpaRepository<Vendor, Long> {

    List<Vendor> findAllByType(VendorType type);
}
