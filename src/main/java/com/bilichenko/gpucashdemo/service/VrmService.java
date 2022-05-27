package com.bilichenko.gpucashdemo.service;

import com.bilichenko.gpucashdemo.model.PwmController;
import com.bilichenko.gpucashdemo.repository.PwmControllerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VrmService {
    private final PwmControllerRepository pwmControllerRepository;

    public VrmService(PwmControllerRepository pwmControllerRepository) {
        this.pwmControllerRepository = pwmControllerRepository;
    }

    public List<PwmController> getPwmControllers() {
        return pwmControllerRepository.findAll();
    }
}
