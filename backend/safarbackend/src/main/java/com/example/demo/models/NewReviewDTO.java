package com.example.demo.models;

public class NewReviewDTO {

    private Long attractionId;

    private int rating;

    private String comment;

    public NewReviewDTO() {
    }

    public NewReviewDTO(Long attractionId, int rating, String comment) {
        this.attractionId = attractionId;
        this.rating = rating;
        this.comment = comment;
    }

    public Long getAttractionId() {
        return attractionId;
    }

    public void setAttractionId(Long attractionId) {
        this.attractionId = attractionId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
