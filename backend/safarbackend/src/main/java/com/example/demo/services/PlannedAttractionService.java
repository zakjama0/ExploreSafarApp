package com.example.demo.services;

import com.example.demo.models.*;
import com.example.demo.repositories.AttractionRepository;
import com.example.demo.repositories.ItineraryRepository;
import com.example.demo.repositories.PlannedAttractionRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class PlannedAttractionService {

    @Autowired
    PlannedAttractionRepository plannedAttractionRepository;
    @Autowired
    ItineraryRepository itineraryRepository;
    @Autowired
    AttractionRepository attractionRepository;
    @Autowired
    UserRepository userRepository;

    private final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            .withLocale(Locale.UK);


    public List<PlannedAttraction> getAllPlannedAttractions(){
        return plannedAttractionRepository.findAll();
    }

    public Optional<PlannedAttraction> getPlannedAttractionById(long id){
        return plannedAttractionRepository.findById(id);
    }

    public List<PlannedAttraction> getPlannedAttractionsByItinerary(Long itinerary){
        return plannedAttractionRepository.findByItineraryId(itinerary);
    }

    public PlannedAttraction savePlannedAttraction(PlannedAttractionDTO plannedAttractionDTO, Principal connectedUser){

        if(plannedAttractionDTO.getItineraryId() == null){

            User user = (User) ((UsernamePasswordAuthenticationToken) connectedUser).getPrincipal();
            Optional<Attraction> attraction = attractionRepository.findById(plannedAttractionDTO.getAttractionId());
            if(user == null || attraction.isEmpty()){
                return null;
            }
            Itinerary newItinerary = Itinerary.builder()
                    .user(user)
                    .name(plannedAttractionDTO.getItineraryName())
                    .image(attraction.get().getImage())
                    .build();
            Itinerary savedItinerary = itineraryRepository.save(newItinerary);

            PlannedAttraction plannedAttraction = new PlannedAttraction(savedItinerary, attraction.get(), format(plannedAttractionDTO.getStartTime()), format(plannedAttractionDTO.getEndTime()));
            PlannedAttraction savedPlannedAttraction = plannedAttractionRepository.save(plannedAttraction);

            savedItinerary.addPlannedAttraction(savedPlannedAttraction);
            itineraryRepository.save(savedItinerary);

            return savedPlannedAttraction;
        }

        Optional<Itinerary> itinerary = itineraryRepository.findById(plannedAttractionDTO.getItineraryId());
        if(itinerary.isEmpty()) {
            return null;
        }

       Optional<Attraction> attraction = attractionRepository.findById(plannedAttractionDTO.getAttractionId());
       if(attraction.isEmpty()){
           return null;
       }

       PlannedAttraction newPlannedAttraction = new PlannedAttraction(itinerary.get(), attraction.get(), format(plannedAttractionDTO.getStartTime()), format(plannedAttractionDTO.getEndTime()));
       itinerary.get().addPlannedAttraction(newPlannedAttraction);
       itineraryRepository.save(itinerary.get());
       return plannedAttractionRepository.save(newPlannedAttraction);
    }

    public Optional<PlannedAttraction> updatePlannedAttraction (Long id, UpdatePlannedAttractionDTO updatePlannedAttractionDTO){
        Optional<PlannedAttraction> plannedAttractionToUpdate = plannedAttractionRepository.findById(id);
        if(plannedAttractionToUpdate.isPresent()){
            plannedAttractionToUpdate.get().setStartDate(updatePlannedAttractionDTO.getStartDate());
            plannedAttractionToUpdate.get().setEndDate(updatePlannedAttractionDTO.getEndDate());
            plannedAttractionRepository.save(plannedAttractionToUpdate.get());
        }
        return plannedAttractionToUpdate;
    }

    public void deletePlannedAttraction(Long id){
        plannedAttractionRepository.deleteById(id);
    }

    private LocalDate format(String date) {
        return LocalDate.parse(date, FORMATTER);
    }
}
