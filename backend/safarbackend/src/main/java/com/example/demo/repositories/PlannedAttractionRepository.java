package com.example.demo.repositories;

import com.example.demo.models.PlannedAttraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlannedAttractionRepository extends JpaRepository<PlannedAttraction, Long> {
}
