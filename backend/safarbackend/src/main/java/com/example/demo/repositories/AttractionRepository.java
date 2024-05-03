package com.example.demo.repositories;

import com.example.demo.models.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {

    List<Attraction> findByCityId(Long cityId);

//    @Query("SELECT AVG(r.rating) FROM Review r WHERE r.attraction.id = :attractionId")
//    Double findAvgRatingByAttractionId(Long attractionId);

}
