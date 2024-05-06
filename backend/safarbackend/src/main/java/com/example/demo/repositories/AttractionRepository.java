package com.example.demo.repositories;

import com.example.demo.models.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {
    List<Attraction> findByCityId(long cityId);

    @Query("SELECT a FROM Country c JOIN c.cities ci JOIN ci.attractions a WHERE c.id = :countryId")
    List<Attraction> findByCountryId(@Param("countryId") Long countryId);
}
