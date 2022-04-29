package com.bilichenko.gpucashdemo.controller;

import com.bilichenko.gpucashdemo.model.Gpu;
import com.bilichenko.gpucashdemo.service.GpuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gpus")
@CrossOrigin("http://localhost:4200")
public class GpuController {

    private final GpuService gpuService;

    public GpuController(GpuService gpuService) {
        this.gpuService = gpuService;
    }

    @GetMapping
    public List<Gpu> getAll() {
        return gpuService.getAll();
    }

    @PostMapping
    public Gpu add(@RequestBody Gpu gpu) {
        return gpuService.add(gpu);
    }
}
