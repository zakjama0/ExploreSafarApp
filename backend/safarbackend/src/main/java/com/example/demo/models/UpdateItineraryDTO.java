package com.example.demo.models;

public class UpdateItineraryDTO {
    private String name;

    public UpdateItineraryDTO() {
    }

    public UpdateItineraryDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
