package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="attractions")
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
    private String description;

    @Column
    private String image;

    @JsonIgnoreProperties({"attraction"})
    @OneToMany(mappedBy = "attraction")
    private List<Review> reviews;

    @OneToMany(mappedBy = "attraction")
    private List<PlannedAttraction> plannedAttractions;

    public Attraction(long id, City city, String description, String image) {
        this.id = id;
        this.city = city;
        this.description = description;
        this.image = image;
    }

    public Attraction() {
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
}
