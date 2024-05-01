package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;

public class PlannedAttraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonIgnoreProperties({"plannedAttractions"})
    @ManyToOne
    @JoinColumn(name = "itinerary_id")
    private Itinerary itinerary;

    @ManyToOne
    @JoinColumn(name = "attraction_id")
    private Attraction attraction;

    @Column
    private LocalDate startDate;
    @Column
    private LocalDate endDate;

    public PlannedAttraction(long id, Itinerary itinerary, Attraction attraction, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.itinerary = itinerary;
        this.attraction = attraction;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public PlannedAttraction() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
