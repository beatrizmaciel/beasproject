package com.project.bea.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
public class Animal extends Organism {
    public Animal(String cachorro, String canidae, String animalia) {
    }
}
