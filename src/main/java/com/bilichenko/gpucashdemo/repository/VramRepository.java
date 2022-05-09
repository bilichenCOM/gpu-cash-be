package com.bilichenko.gpucashdemo.repository;

import com.bilichenko.gpucashdemo.model.Vram;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VramRepository extends JpaRepository<Vram, Long> {
}
