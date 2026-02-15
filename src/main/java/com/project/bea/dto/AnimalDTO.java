package com.project.bea.dto;

import lombok.Data;

// hashCode é o ponteiro de direcionamento do objeto
@Data // toString, hashCode, equals, getters e setters, allargsconstructor, noargsconstructor
public class AnimalDTO {
    private int id;
    private String name;
    private String family;
    private String kingdom;
}