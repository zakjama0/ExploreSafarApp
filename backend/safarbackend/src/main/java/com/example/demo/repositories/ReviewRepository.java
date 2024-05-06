package com.example.demo.repositories;

import com.example.demo.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByUserId(Long userId);
    List<Review> findByAttractionId(Long id);

    @Query("SELECT AVG(rating) FROM reviews r WHERE r.attraction.id = :attractionId")
    Double findAvgRatingByAttractionId(Long attractionId);

}
