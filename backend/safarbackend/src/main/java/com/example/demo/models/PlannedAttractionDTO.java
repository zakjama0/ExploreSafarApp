package com.example.demo.models;

import java.time.LocalDate;

public class PlannedAttractionDTO {

    private Long itineraryId;
    private Long attractionId;
    private LocalDate startTime;
    private LocalDate endTime;
    private String itineraryName;

    public PlannedAttractionDTO(){

    }

    public PlannedAttractionDTO(Long itineraryId, Long attractionId, LocalDate startTime, LocalDate endTime, Long userId, String itineraryName) {
        this.itineraryId = itineraryId;
        this.attractionId = attractionId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.itineraryName = itineraryName;
    }

    public Long getItineraryId() {
        return itineraryId;
    }

    public void setItineraryId(Long itineraryId) {
        this.itineraryId = itineraryId;
    }

    public Long getAttractionId() {
        return attractionId;
    }

    public void setAttractionId(Long attractionId) {
        this.attractionId = attractionId;
    }

    public LocalDate getStartDate() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndDate() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public String getItineraryName() {
        return itineraryName;
    }

    public void setItineraryName(String itineraryName) {
        this.itineraryName = itineraryName;
    }
}
