package com.example.demo.repositories;

import com.example.demo.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    @Query("SELECT AVG(r.rating) FROM Review r WHERE r.attraction.id = :itemId")
    Double findAvgRatingByAttractionId(Long attractionId);
    List<Review> findByUserId(Long userId);
    List<Review> findByAttractionId(long id);

}
