package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name="cities")
public class City {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @JoinColumn(name = "country_id")
    private Country country;

    public City(long id, String name, Country country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public City() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
