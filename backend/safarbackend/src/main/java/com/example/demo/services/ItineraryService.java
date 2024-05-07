package com.example.demo.services;

import com.example.demo.models.Itinerary;
import com.example.demo.models.UpdateItineraryDTO;
import com.example.demo.repositories.ItineraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItineraryService {

    private final ItineraryRepository itineraryRepository;

    @Autowired
    public ItineraryService(ItineraryRepository itineraryRepository){
        this.itineraryRepository = itineraryRepository;
    }

    public List<Itinerary> getAllItineraries() {
        return itineraryRepository.findAll();
    }

    public Optional<Itinerary> getById(Long id) {
        return itineraryRepository.findById(id);
    }


    public Optional<Itinerary> updateItinerary(Long id, UpdateItineraryDTO updateItineraryDTO){
        Optional<Itinerary> itineraryToUpdate = itineraryRepository.findById(id);
        if(itineraryToUpdate.isPresent()){
            itineraryToUpdate.get().setName(updateItineraryDTO.getName());
            itineraryRepository.save(itineraryToUpdate.get());
        }
        return itineraryToUpdate;
    }


    public void deleteItinerary(Long id){
         itineraryRepository.deleteById(id);
    }
}
