package com.example.demo.services;

import com.example.demo.models.*;
import com.example.demo.repositories.AttractionRepository;
import com.example.demo.repositories.ItineraryRepository;
import com.example.demo.repositories.PlannedAttractionRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;
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

            Optional<User> user = userRepository.findById(plannedAttractionDTO.getUserId());
            Optional<Attraction> attraction = attractionRepository.findById(plannedAttractionDTO.getAttractionId());
            if(user.isEmpty() || attraction.isEmpty()){
                return null;
            }
            Itinerary newItinerary = new Itinerary(user.get(), plannedAttractionDTO.getItineraryName(), attraction.get().getImage());
            Itinerary savedItinerary = itineraryRepository.save(newItinerary);

            PlannedAttraction plannedAttraction = new PlannedAttraction(savedItinerary, attraction.get(), plannedAttractionDTO.getStartDate(), plannedAttractionDTO.getEndDate());
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

       PlannedAttraction newPlannedAttraction = new PlannedAttraction(itinerary.get(), attraction.get(), plannedAttractionDTO.getStartDate(),plannedAttractionDTO.getEndDate());
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
}
