package com.bilichenko.gpucashdemo.service;

import com.bilichenko.gpucashdemo.model.Gpu;
import com.bilichenko.gpucashdemo.repository.GpuRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GpuService {
    private final GpuRepository gpuRepository;

    public GpuService(GpuRepository gpuRepository) {
        this.gpuRepository = gpuRepository;
    }

    public List<Gpu> getAll() {
        return gpuRepository.findAll();
    }

    public Gpu add(Gpu gpu) {
        return gpuRepository.save(gpu);
    }
}
