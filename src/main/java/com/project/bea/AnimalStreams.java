package com.project.bea;

import com.project.bea.model.Animal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalStreams {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Animal("Cachorro", "Canidae", "Animalia"),
                new Animal("Lobo", "Canidae", "Animalia"),
                new Animal("Gato", "Felidae", "Animalia"),
                new Animal("Leão", "Felidae", "Animalia"),
                new Animal("Tigre", "Felidae", "Animalia"),
                new Animal("Elefante", "Elephantidae", "Animalia"),
                new Animal("Girafa", "Giraffidae", "Animalia"),
                new Animal("Cavalo", "Equidae", "Animalia"),
                new Animal("Cobra", "Colubridae", "Animalia"),
                new Animal("Sapo", "Ranidae", "Animalia")
        );

        List<Animal> felidae = animals.stream()
                .filter(a -> a.getFamily().equals("Felidae"))
                .collect(Collectors.toList());
        System.out.println("Felidae: " + felidae); // perguntar sobre sobreescrever o toString

        List<String> animaliaNames = animals.stream()
                .map(Animal::getName)
                .collect(Collectors.toList());
        System.out.println("Nomes Animalia: " + animaliaNames);

        // se houvesse reinos diferentes, usar filter ?
        List<String> animaliaFilteredNames = animals.stream()
                .filter(animal -> animal.getKingdom().equals("Animalia"))
                .map(Animal::getName)
                .collect(Collectors.toList());
        System.out.println("Nomes Animalia filtrados: " + animaliaFilteredNames);

        List<String> uniqueFamilies = animals.stream()
                .map(Animal::getFamily)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Todas as familias: " + uniqueFamilies);

    }
}
