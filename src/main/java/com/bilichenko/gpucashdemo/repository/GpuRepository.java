package com.bilichenko.gpucashdemo.repository;

import com.bilichenko.gpucashdemo.model.Gpu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GpuRepository extends JpaRepository<Gpu, Long> {
}
