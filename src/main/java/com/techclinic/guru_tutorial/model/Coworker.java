package com.techclinic.guru_tutorial.model;

import java.util.Set;

public class Coworker extends Person{

    private String specialty;

    public Coworker() {
    }

    public Coworker(String specialty) {
        this.specialty = specialty;
    }

    public Coworker(String firstName, String lastName, String specialty) {
        super(firstName, lastName);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
