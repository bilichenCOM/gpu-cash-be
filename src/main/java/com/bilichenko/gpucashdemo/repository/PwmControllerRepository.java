package com.bilichenko.gpucashdemo.repository;

import com.bilichenko.gpucashdemo.model.PwmController;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PwmControllerRepository extends JpaRepository<PwmController, Long> {
}
