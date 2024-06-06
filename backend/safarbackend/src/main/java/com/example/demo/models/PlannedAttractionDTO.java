package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PlannedAttractionDTO {

    private Long itineraryId;
    private Long attractionId;
    private String startTime;
    private String endTime;
    private String itineraryName;
}
