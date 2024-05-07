package com.example.demo;

import com.example.demo.enums.Continent;
import com.example.demo.enums.Region;
import com.example.demo.models.*;
import com.example.demo.repositories.*;
import com.example.demo.services.ItineraryService;
import com.example.demo.services.PlannedAttractionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class LogicTest {

    private final PlannedAttractionService plannedAttractionService;
    private final ItineraryService itineraryService;
    private final UserRepository userRepository;
    private final AttractionRepository attractionRepository;
    private final CountryRepository countryRepository;
    private final CityRepository cityRepository;

    @Autowired
    public LogicTest(PlannedAttractionService plannedAttractionService, ItineraryService itineraryService, UserRepository userRepository, AttractionRepository attractionRepository, CountryRepository countryRepository, CityRepository cityRepository) {
        this.plannedAttractionService = plannedAttractionService;
        this.itineraryService = itineraryService;
        this.userRepository = userRepository;
        this.attractionRepository = attractionRepository;
        this.countryRepository = countryRepository;
        this.cityRepository = cityRepository;
    }


    private static final String NAME = "John";
    private static final String EMAIL = "john@example.com";
    private static final String PASSWORD = "password";

    private User user;
    private Attraction attraction;
    private Attraction attraction1;
    private City city;
    private Country country;

    @BeforeEach
    public void setUp(){

        user = new User(NAME, EMAIL, PASSWORD);
        userRepository.save(user);

        country = new Country(Region.NORTHERN_AFRICA, Continent.AFRICA, "empty", "Egypt");
        countryRepository.save(country);

        city = new City("Giza", country);
        cityRepository.save(city);

        attraction = new Attraction("Great Pyramids of Giza", city, "Big Pyramids", "no img sorry");
        attractionRepository.save(attraction);

        attraction1 = new Attraction("Great Sphinx of Giza", city, "Big Lion", "Think cat");
        attractionRepository.save(attraction1);
    }

    @Test
    public void testAddPlannedAttractionWithNoItinerary() {
        int itineraryCountBeforeAdding = itineraryService.getAllItineraries().size();
        PlannedAttractionDTO plannedAttractionDTO = new PlannedAttractionDTO(attraction.getId(), LocalDate.now(), LocalDate.of(2024, 8, 7), user.getId(), "Egypt Trip");
        PlannedAttraction plannedAttraction = plannedAttractionService.savePlannedAttraction(plannedAttractionDTO);
        int itineraryCountAfterAdding = itineraryService.getAllItineraries().size();

        assertThat(plannedAttraction.getAttraction().getId()).isEqualTo(attraction.getId());
        assertThat(plannedAttraction.getStartDate()).isEqualTo(LocalDate.now());
        assertThat(plannedAttraction.getEndDate()).isEqualTo(LocalDate.of(2024, 8, 7));
        assertThat(itineraryCountBeforeAdding + 1).isEqualTo(itineraryCountAfterAdding);
    }

    @Test
    public void testAddPlannedAttractionToExistingItinerary() {

        PlannedAttractionDTO plannedAttractionDTO = new PlannedAttractionDTO(attraction.getId(), LocalDate.now(), LocalDate.of(2024, 8, 7), user.getId(), "Egypt Trip");
        PlannedAttraction plannedAttraction = plannedAttractionService.savePlannedAttraction(plannedAttractionDTO);
        Itinerary itinerary = itineraryService.getById(plannedAttraction.getId()).get();

        PlannedAttractionDTO plannedAttractionDTO1 = new PlannedAttractionDTO(itinerary.getId(), attraction1.getId(), LocalDate.now(), LocalDate.of(2024, 8, 7), user.getId());
        PlannedAttraction plannedAttraction1 = plannedAttractionService.savePlannedAttraction(plannedAttractionDTO1);

        Itinerary updatedItinerary = itineraryService.getById(plannedAttraction1.getItinerary().getId()).get();
        assertThat(updatedItinerary.getPlannedAttractions().size()).isEqualTo(2);
    }
}
