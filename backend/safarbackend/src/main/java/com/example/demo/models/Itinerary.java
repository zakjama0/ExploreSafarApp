package com.example.demo.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "itineraries")
public class Itinerary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;

    @Column
    private String image;

    @OneToMany(mappedBy = "itinerary")
    private List<PlannedAttraction> plannedAttractions;

    public Itinerary(){
    }

    public Itinerary(User user, String image) {
        this.user = user;
        this.image = image;
        this.plannedAttractions = new ArrayList<>();
    }

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
}
