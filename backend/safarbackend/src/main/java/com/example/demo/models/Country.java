package com.example.demo.models;

import com.example.demo.enums.Continent;
import com.example.demo.enums.Region;
import jakarta.persistence.*;
import net.minidev.json.annotate.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "countries")
public class Country {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "country")
    @JsonIgnore
    private List<City> cities;

    @Column
    private Region region;

    @Column
    private Continent continent;

    @Column
    private String image;

    @Column
    private String name;

    public Country() {

    }

    public Country(Region region, Continent continent, String image, String name) {
        this.cities = new ArrayList<>();
        this.region = region;
        this.continent = continent;
        this.image = image;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
