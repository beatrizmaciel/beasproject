package com.project.bea.model;

import lombok.Getter;

@Getter
public class Animal {

    private String name;
    private String family;
    private String kingdom;

    public Animal(String name, String family, String kingdom) {
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
