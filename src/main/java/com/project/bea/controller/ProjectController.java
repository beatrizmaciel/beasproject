package com.project.bea.controller;

import com.project.bea.dto.AnimalDTO;
import com.project.bea.model.Animal;
import com.project.bea.service.AnimalService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animals")
public class ProjectController {

    private AnimalService animalService;

    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalService.findAll();
    }

    @GetMapping("/{id}")
    public Animal findById(@PathVariable int id) {
        return animalService.findById(id);
    }

    @PostMapping
    public Animal getAllAnimals(@RequestBody @Validated AnimalDTO animalDTO) {
        return animalService.save(animalDTO);
    }
}
