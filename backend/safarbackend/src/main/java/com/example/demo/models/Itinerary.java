package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "itineraries")
public class Itinerary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(unique = true)
    private String name;

    @JoinColumn(name = "user_id")
    @ManyToOne
    @JsonIgnore
    private User user;

    @Column
    private String image;

    @OneToMany(mappedBy = "itinerary")
    @JsonIgnoreProperties({"itinerary"})
    private List<PlannedAttraction> plannedAttractions;

    // Methods
    public void addPlannedAttraction(PlannedAttraction plannedAttraction) {
        this.plannedAttractions.add(plannedAttraction);
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<PlannedAttraction> getPlannedAttractions() {
        return plannedAttractions;
    }

    public void setPlannedAttractions(List<PlannedAttraction> plannedAttractions) {
        this.plannedAttractions = plannedAttractions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
