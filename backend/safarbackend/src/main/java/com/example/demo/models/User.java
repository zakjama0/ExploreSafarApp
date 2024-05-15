package com.example.demo.models;

import com.example.demo.encryptor.StringCryptoConverter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    @Convert(converter = StringCryptoConverter.class)
    private String name;

    @Column(name = "email", unique = true, nullable = false)
    @Convert(converter = StringCryptoConverter.class)
    private String email;

    @JsonIgnore
    @Column(name = "password", nullable = false)
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Itinerary> itineraries;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews;

    public User() {

    }

    public User(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.reviews = new ArrayList<>();
    this.itineraries = new ArrayList<>();
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

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Itinerary> getItineraries() {
        return itineraries;
    }

    public void setItineraries(List<Itinerary> itineraries) {
        this.itineraries = itineraries;
    }
}
