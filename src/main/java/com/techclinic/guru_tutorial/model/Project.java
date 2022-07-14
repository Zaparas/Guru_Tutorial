package com.techclinic.guru_tutorial.model;

import java.time.LocalDate;

public class Project extends BaseEntity{

    private String name;
    private LocalDate entryDate;

    public Project() {
    }

    public Project(String name, LocalDate entryDate) {
        this.name = name;
        this.entryDate = entryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }
}
