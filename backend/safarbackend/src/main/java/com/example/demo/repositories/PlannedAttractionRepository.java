package com.example.demo.repositories;

import com.example.demo.models.Itinerary;
import com.example.demo.models.PlannedAttraction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlannedAttractionRepository extends JpaRepository<PlannedAttraction, Long> {
    List<PlannedAttraction> findByItineraryId(Long itineraryId);
}
