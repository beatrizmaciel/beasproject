package com.project.bea.model;

import lombok.Getter;

@Getter
public class Animal extends Organism {

    public Animal(String name, String family, String kingdom) {
        super(name, family, kingdom);
    }

}
