package com.example.demo.enums;

public enum Continent {

    AFRICA("Africa"),
    ASIA("Asia"),
    EUROPE("Europe"),
    NORTH_AMERICA("North America"),
    OCEANIA("Oceania"),
    SOUTH_AMERICA("South America");

    final String displayName;

    Continent(String displayName) {
        this.displayName = displayName;
    }

    public static String valueOfDisplayName(String continentName) {
        for(Continent continentEnum : Continent.values()){
            if(continentEnum.displayName.equals(continentName)) {
                return continentEnum.displayName;
            }
        }
        return null;
    }
}
