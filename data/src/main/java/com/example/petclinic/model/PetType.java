package com.example.petclinic.model;

public class PetType extends BaseEntity {
    private String pateName;

    public String getPateName() {
        return pateName;
    }

    public void setPateName(String pateName) {
        this.pateName = pateName;
    }
}
