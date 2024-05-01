package com.example.demo.enums;

public enum Category {

    MORNING("Morning"),
    EVENING("Evening"),
    TRAVEL_ETIQUETTE("Travel Etiquette"),
    TRAVEL_DUA("Travel Dua"),
    STORIES("Stories");

    final String displayName;

    Category(String displayName){
        this.displayName = displayName;
    }
}
