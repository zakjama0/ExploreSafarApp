package com.example.demo.repositories;

import com.example.demo.models.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {
//     @Query("SELECT o FROM Attraction o WHERE country.id = :countryId")
    List<Attraction> getAttractionsByCountryId(long countryId);
    List<Attraction> getAttractionsByCityId(long cityId);
//    @Query("SELECT AVG(r.rating) FROM Review r WHERE r.item.id = :itemId")
    Double findAvgRatingByAttractionId(Long attractionId);

}
