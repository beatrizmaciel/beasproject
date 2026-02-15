package com.project.bea.service;

import com.project.bea.dto.AnimalDTO;
import com.project.bea.mapper.AnimalMapper;
import com.project.bea.model.Animal;
import com.project.bea.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private AnimalMapper animalMapper;
    private AnimalRepository animalRepository;

    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    public Animal findById(Integer id) {
        return animalRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Animal não encontrado com id : " + id)
        );
    }

    public Animal save(AnimalDTO animalDTO) {
        return animalMapper.dtoToAnimal(animalDTO);
    }

}
