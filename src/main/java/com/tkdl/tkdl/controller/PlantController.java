package com.tkdl.tkdl.controller;

import com.tkdl.tkdl.model.Plants;
import com.tkdl.tkdl.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plants")
@CrossOrigin
public class PlantController {

    @Autowired
    private PlantRepository plantRepo;

    @GetMapping
    public List<Plants> getAllPlants() {
        return plantRepo.findAll();
    }

    @GetMapping("/search")
    public List<Plants> searchPlants(@RequestParam String keyword) {
        return plantRepo.findByNameContainingIgnoreCaseOrUsageContainingIgnoreCase(keyword, null);
    }
}

