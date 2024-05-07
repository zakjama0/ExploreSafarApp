package com.example.demo.models;

import java.time.LocalDate;

public class UpdatePlannedAttractionDTO {
    private LocalDate startDate;
    private LocalDate endDate;

    public UpdatePlannedAttractionDTO() {
    }

    public UpdatePlannedAttractionDTO(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
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
