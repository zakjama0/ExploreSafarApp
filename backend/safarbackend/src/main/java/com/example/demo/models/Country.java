package com.example.demo.models;

import com.example.demo.enums.Continent;
import com.example.demo.enums.Region;
import jakarta.persistence.*;
import net.minidev.json.annotate.JsonIgnore;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "country")
    @JsonIgnore
    private List<City> cities;

    @OneToMany(mappedBy = "country")
    @JsonIgnore
    private List<Attraction> attractions;

    @Column
    private Region region;
    @Column
    private Continent continent;

    public Country(long id, List<City> cities, List<Attraction> attractions, Region region, Continent continent) {
        this.id = id;
        this.cities = cities;
        this.attractions = attractions;
        this.region = region;
        this.continent = continent;
    }

    public Country() {
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

    public List<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(List<Attraction> attractions) {
        this.attractions = attractions;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
