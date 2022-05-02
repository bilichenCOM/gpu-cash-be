package com.bilichenko.gpucashdemo.service;

import com.bilichenko.gpucashdemo.model.Gpu;
import com.bilichenko.gpucashdemo.repository.GpuRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Gpu> getById(Long id) {
        return gpuRepository.findById(id);
    }

    public Gpu update(Gpu gpu) {
        return gpuRepository.save(gpu);
    }

    public void delete(Gpu gpu) {
        gpuRepository.delete(gpu);
    }
}
