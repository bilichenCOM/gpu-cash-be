package com.bilichenko.gpucashdemo.controller;

import com.bilichenko.gpucashdemo.model.PwmController;
import com.bilichenko.gpucashdemo.service.VrmService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class VrmController {

    private final VrmService vrmService;

    public VrmController(VrmService vrmService) {
        this.vrmService = vrmService;
    }

    @GetMapping("/pwm-controllers")
    public List<PwmController> getPwmControllers() {
        return vrmService.getPwmControllers();
    }
}
