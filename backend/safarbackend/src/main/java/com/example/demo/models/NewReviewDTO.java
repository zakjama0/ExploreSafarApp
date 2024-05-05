package com.example.demo.models;

public class NewReviewDTO {

    private Long itemId;

    private Long customerId;

    private int rating;

    private String comment;

    public NewReviewDTO() {
    }

    public NewReviewDTO(Long itemId, Long customerId, int rating, String comment) {
        this.itemId = itemId;
        this.customerId = customerId;
        this.rating = rating;
        this.comment = comment;
    }

    public Long getAttractionId() {
        return itemId;
    }

    public void setAttractionId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getUserId() {
        return customerId;
    }

    public void setUserId(Long customerId) {
        this.customerId = customerId;
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
