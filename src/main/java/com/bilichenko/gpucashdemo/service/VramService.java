package com.bilichenko.gpucashdemo.service;

import com.bilichenko.gpucashdemo.model.Vram;
import com.bilichenko.gpucashdemo.repository.VramRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VramService {
    private final VramRepository vramRepository;

    public VramService(VramRepository vramRepository) {
        this.vramRepository = vramRepository;
    }

    public List<Vram> getAll() {
        return vramRepository.findAll();
    }

    public Vram add(Vram vram) {
        return vramRepository.save(vram);
    }

    public Optional<Vram> getById(Long id) {
        return vramRepository.findById(id);
    }

    public Vram update(Vram vram) {
        return vramRepository.save(vram);
    }
}
