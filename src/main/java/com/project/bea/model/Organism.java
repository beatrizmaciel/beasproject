package com.project.bea.model;

import lombok.Getter;

@Getter
public abstract class Organism {
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
