package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "attractions")
public class Attraction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @JsonIgnoreProperties({"attractions"})
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @Column
    private String name;

    @Column(length = 65535)
    private String description;

    @Column
    private String image;

    @JsonIgnoreProperties({"attraction"})
    @OneToMany(mappedBy = "attraction")
    private List<Review> reviews;

    @OneToMany(mappedBy = "attraction")
    private List<PlannedAttraction> plannedAttractions;

    public Attraction() {

    }

    public Attraction(String name, City city, String description, String image) {
        this.city = city;
        this.name = name;
        this.description = description;
        this.image = image;
        this.reviews = new ArrayList<>();
        this.plannedAttractions = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<PlannedAttraction> getPlannedAttractions() {
        return plannedAttractions;
    }

    public void setPlannedAttractions(List<PlannedAttraction> plannedAttractions) {
        this.plannedAttractions = plannedAttractions;
    }
}
