package com.project.bea.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public abstract class Organism {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String family;
    private String kingdom;

    public Organism(String name, String family, String kingdom) {
        this.name = name;
        this.family = family;
        this.kingdom = kingdom;
    }

    // falar sobre isso
    @Override
    public String toString() {
        return name + " (" + family + ", " + kingdom + ")";
    }
}
