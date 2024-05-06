package com.example.demo.repositories;

import com.example.demo.models.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {
    List<Attraction> findByCountryId(long countryId);
    List<Attraction> findByCityId(long cityId);
}
