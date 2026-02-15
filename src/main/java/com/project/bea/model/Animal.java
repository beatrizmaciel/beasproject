package com.project.bea.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Animal extends Organism {

    @Id
    @GeneratedValue
    private Integer id;

    @Builder
    public Animal(String name, String family, String kingdom) {
        super(name, family, kingdom);
    }

}
