package com.example.demo.controllers;

import com.example.demo.models.Itinerary;
import com.example.demo.models.UpdateItineraryDTO;
import com.example.demo.services.ItineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/itineraries")
public class ItineraryController {

    @Autowired
    ItineraryService itineraryService;

    @GetMapping
    public ResponseEntity<List<Itinerary>> getAllItineraries() {
        List<Itinerary> itineraries = itineraryService.getAllItineraries();
        return new ResponseEntity<>(itineraries, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Itinerary>> getItineraryByUser(Principal connectedUser) {
        List<Itinerary> itineraries = itineraryService.getItinerariesByUser(connectedUser);
        return new ResponseEntity<>(itineraries, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Itinerary> getItineraryById(@PathVariable Long id) {
        Optional<Itinerary> itinerary = itineraryService.getById(id);
        if(itinerary.isPresent()) {
            return new ResponseEntity<>(itinerary.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<Itinerary> updateItinerary (@PathVariable Long id, @RequestBody UpdateItineraryDTO updateItineraryDTO){
        Optional<Itinerary> updatedItinerary = itineraryService.updateItinerary(id,updateItineraryDTO);
        if (updatedItinerary.isPresent()){
            return new ResponseEntity<>(updatedItinerary.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping
    public ResponseEntity<Long> deleteItinerary(@PathVariable Long id){
        itineraryService.deleteItinerary(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
