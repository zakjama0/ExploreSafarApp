package com.example.demo.enums;

public enum Category {

    DAILY("Daily Duas"),
    TRAVEL_ETIQUETTE("Travel Etiquette"),
    TRAVEL_DUA("Travel Dua"),
    TRAVEL_VIRTUES("Travel Virtues");

    final String displayName;

    Category(String displayName){
        this.displayName = displayName;
    }
}
