package com.example.demo.services;

import com.example.demo.models.*;
import com.example.demo.repositories.AttractionRepository;
import com.example.demo.repositories.ItineraryRepository;
import com.example.demo.repositories.PlannedAttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
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


    public List<PlannedAttraction> getAllPlannedAttractions(){
        return plannedAttractionRepository.findAll();
    }
    public Optional<PlannedAttraction> getPlannedAttractionById(long id){
        return plannedAttractionRepository.findById(id);
    }
    public List<PlannedAttraction> getPlannedAttractionsByItinerary(Long itineraryId){
        return plannedAttractionRepository.findByItineraryId(itineraryId);
    }
    public PlannedAttraction savePlannedAttraction(PlannedAttractionDTO plannedAttractionDTO){
      Optional<Itinerary> itinerary = itineraryRepository.findById(plannedAttractionDTO.getItineraryId());
      if(itinerary.isEmpty()){
          return null;
      }
      Optional<Attraction> attraction = attractionRepository.findById(plannedAttractionDTO.getAttractionId());
      if(attraction.isEmpty()){
          return null;
      }
      PlannedAttraction newPlannedAttraction = new PlannedAttraction(itinerary.get(),attraction.get(), plannedAttractionDTO.getStartTime(),plannedAttractionDTO.getEndTime());
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
