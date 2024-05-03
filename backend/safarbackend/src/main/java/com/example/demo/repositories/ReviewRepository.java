package com.example.demo.repositories;

import com.example.demo.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Double findAvgRatingByAttractionId(Long attractionId);
    List<Review> findByUserId(Long userId);
}
