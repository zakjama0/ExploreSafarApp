package com.example.demo.models;

import jakarta.persistence.*;

import java.util.List;


@Table
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "emails")
    private String email;

    @Column(name = "passwords")
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Itinerary> itineraries;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews;

    public User() {

    }

    public User(Long id, String name, String email, String password, List<Itinerary> itineraries) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.itineraries = itineraries;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Itinerary> getItineraries() {
        return itineraries;
    }

    public void setItineraries(List<Itinerary> itineraries) {
        this.itineraries = itineraries;
    }
}
