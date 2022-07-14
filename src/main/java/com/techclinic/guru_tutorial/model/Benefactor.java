package com.techclinic.guru_tutorial.model;

public class Benefactor extends Person{

    private String type;
    private int contactNumber;

    public Benefactor() {
    }

    public Benefactor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Benefactor(String type, int contactNumber) {
        this.type = type;
        this.contactNumber = contactNumber;
    }

    public Benefactor(String firstName, String lastName, String type, int contactNumber) {
        super(firstName, lastName);
        this.type = type;
        this.contactNumber = contactNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }


}
