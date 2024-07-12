package com.example.demo.services;

import com.example.demo.models.*;
import com.example.demo.repositories.AttractionRepository;
import com.example.demo.repositories.ReviewRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final AttractionRepository attractionRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository,
                         AttractionRepository attractionRepository) {
        this.reviewRepository = reviewRepository;
        this.attractionRepository = attractionRepository;
    }

    public List<Review> getAllReviews(){
        return reviewRepository.findAll();
    }
    public Optional<Review> getReviewById (Long id){
        return reviewRepository.findById(id);
    }
    public List<Review> getReviewsByUser (Principal connectedUser){
        User user = (User) ((UsernamePasswordAuthenticationToken) connectedUser).getPrincipal();
        List<Review> reviews = reviewRepository.findByUserId(user.getId());
        return reviews;
    }
    public List<Review> getReviewsByAttractionId (Long id){
        return reviewRepository.findByAttractionId(id);
    }

    public Review saveReview (NewReviewDTO newReviewDTO, Principal connectedUser){

        User user = (User) ((UsernamePasswordAuthenticationToken) connectedUser).getPrincipal();

        Optional<Attraction> attraction = attractionRepository.findById(newReviewDTO.getAttractionId());
        if(attraction.isEmpty()){
            return null;
        }

        Review newReview = new Review(newReviewDTO.getRating(), newReviewDTO.getComment(), user, attraction.get());
        return reviewRepository.save(newReview);
    }
    public Optional<Review> updateReview(Long id, UpdateReviewDTO reviewDTO){
        Optional<Review> reviewToUpdate = reviewRepository.findById(id);
        if(reviewToUpdate.isPresent()) {
            reviewToUpdate.get().setRating(reviewDTO.getRating());
            reviewToUpdate.get().setComment(reviewDTO.getComment());
            reviewRepository.save(reviewToUpdate.get());
        }
        return reviewToUpdate;
    }
    public void deleteReview(Long id){
        reviewRepository.deleteById(id);
    }

    public Double getAvgRatingByAttractionId (Long attractionId) {
        if(attractionRepository.findById(attractionId).isPresent()) {
            return reviewRepository.findAvgRatingByAttractionId(attractionId);
        }
        return null;
    }

}
