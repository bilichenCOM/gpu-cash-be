package com.bilichenko.gpucashdemo.controller;

import com.bilichenko.gpucashdemo.model.Vram;
import com.bilichenko.gpucashdemo.service.VramService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/vrams")
@CrossOrigin("http://localhost:4200")
public class VramController {

    private final VramService vramService;

    public VramController(VramService vramService) {
        this.vramService = vramService;
    }

    @GetMapping
    public List<Vram> getAll() {
        return vramService.getAll();
    }

    @PostMapping
    public Vram add(@RequestBody Vram vram) {
        return vramService.add(vram);
    }

    @GetMapping("/{id}")
    public Vram getById(@PathVariable Long id) {
        return vramService.getById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping
    public Vram update(@RequestBody Vram vram) {
        return vramService.update(vram);
    }
}
