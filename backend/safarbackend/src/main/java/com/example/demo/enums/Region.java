package com.example.demo.enums;

public enum Region {

    NORTHERN_AFRICA("Northern Africa"),
    WESTERN_AFRICA("Western Africa"),
    EASTERN_AFRICA("Eastern Africa"),
    SOUTHERN_AFRICA("Southern Africa"),
    CENTRAL_AFRICA("Central Africa"),
    MIDDLE_EAST("Middle East"),
    EAST_ASIA("East Asia"),
    SOUTH_ASIA("South Asia"),
    SOUTH_EAST_ASIA("South East Asia"),
    OCEANIA("Oceania"),
    CENTRAL_ASIA("Central Asia"),
    WESTERN_EUROPE("Western Europe"),
    CENTRAL_EUROPE("Central Europe"),
    EASTERN_EUROPE("Eastern Europe"),
    MEDITERRANEAN("Mediterranean"),
    SCANDINAVIA("Scandinavia"),
    WEST_COAST("West Coast"),
    EAST_COAST("East Coast"),
    CARIBBEAN("Caribbean"),
    CENTRAL_AMERICA("Central America"),
    NORTHERN_AMERICA("North America");


    final String displayName;

    Region(String displayName) {
        this.displayName = displayName;
    }

    public static String valueOfDisplayName(String regionName) {
        for(Region regionEnum : Region.values()){
            if(regionEnum.name().equals(regionName)) {
                return regionEnum.displayName;
            }
        }
        return null;
    }
}
