package com.example.demo.enums;

public enum Category {

    MORNING("Morning"),
    EVENING("Evening"),
    TRAVEL_ETIQUETTE("Travel Etiquette"),
    TRAVEL_DUA("Travel Dua"),
    TRAVEL_VIRTUES("Travel Virtues");

    final String displayName;

    Category(String displayName){
        this.displayName = displayName;
    }
}
