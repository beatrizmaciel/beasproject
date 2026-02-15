package com.project.bea.mapper;

import com.project.bea.dto.AnimalDTO;
import com.project.bea.model.Animal;
import org.mapstruct.Mapper;

@Mapper
public interface AnimalMapper {

    Animal dtoToAnimal(AnimalDTO animalDTO);

}

/*
==================

public class AnimalMapper {
    public Animal toAnimal(AnimalDTO animal) {
        return Animal.builder()
                .name(animalDTO.getName())
                .family(animalDTO.getFamily())
                .kingdom(animalDTO.getKingdom())
                .build();
    }
}*/