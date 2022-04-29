package com.bilichenko.gpucashdemo.repository;

import com.bilichenko.gpucashdemo.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
