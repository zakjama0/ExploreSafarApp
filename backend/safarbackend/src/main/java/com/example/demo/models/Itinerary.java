package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "itineraries")
public class Itinerary {

    // Getters and Setters
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Setter
    @Getter
    @Column(unique = true)
    private String name;

    @Setter
    @Getter
    @JoinColumn(name = "user_id")
    @ManyToOne
    @JsonIgnore
    private User user;

    @Getter
    @Setter
    @Column
    private String image;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "d/M/yy")
    private LocalDate startDate;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "d/M/yy")
    private LocalDate endDate;

    @Setter
    @Getter
    @OneToMany(mappedBy = "itinerary")
    @JsonIgnoreProperties({"itinerary"})
    private List<PlannedAttraction> plannedAttractions;

    // Methods
    public void addPlannedAttraction(PlannedAttraction plannedAttraction) {
        this.plannedAttractions.add(plannedAttraction);
        changeStartEndDate();
    }

    private void changeStartEndDate() {
        for(PlannedAttraction plannedAttraction : this.plannedAttractions){

            if(plannedAttraction.getStartDate().isBefore(this.startDate)){
                setStartDate(plannedAttraction.getStartDate());
            }

            if(plannedAttraction.getEndDate().isAfter(this.endDate)){
                setEndDate(plannedAttraction.getEndDate());
            }
        }
    }

}
