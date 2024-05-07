package com.example.demo.controllers;

import com.example.demo.models.PlannedAttraction;
import com.example.demo.models.PlannedAttractionDTO;
import com.example.demo.models.Review;
import com.example.demo.models.UpdatePlannedAttractionDTO;
import com.example.demo.services.PlannedAttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "plannedAttractions")
public class PlannedAttractionController {
    @Autowired
    PlannedAttractionService plannedAttractionService;

    @GetMapping
    public ResponseEntity<List<PlannedAttraction>> getAllPlannedAttractions(){
        List<PlannedAttraction> plannedAttractions = plannedAttractionService.getAllPlannedAttractions();
        return new ResponseEntity<>(plannedAttractions, HttpStatus.OK);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<PlannedAttraction> getPlannedAttractionById(@PathVariable Long id){
        Optional<PlannedAttraction> plannedAttraction = plannedAttractionService.getPlannedAttractionById(id);
        if(plannedAttraction.isPresent()){
            return new ResponseEntity<>(plannedAttraction.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
    @GetMapping
    public ResponseEntity<List<PlannedAttraction>> getPlannedAttractionsByItinerary(@PathVariable Long itineraryid){
        List<PlannedAttraction> plannedAttractions = plannedAttractionService.getPlannedAttractionsByItinerary(itineraryid);
        if(plannedAttractions.isEmpty()){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(plannedAttractions, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<PlannedAttraction> addPlannedAttraction(@RequestBody PlannedAttractionDTO plannedAttractionDTO){
        PlannedAttraction newPlannedAttraction = plannedAttractionService.savePlannedAttraction(plannedAttractionDTO);
        if(newPlannedAttraction == null){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(newPlannedAttraction,HttpStatus.CREATED);
    }
    @PatchMapping(value = "/{id}")
    public ResponseEntity<PlannedAttraction> updatePlannedAttraction(@PathVariable Long id, @RequestBody UpdatePlannedAttractionDTO updatePlannedAttractionDTO){
        Optional<PlannedAttraction> updatedPlannedAttraction = plannedAttractionService.updatePlannedAttraction(id, updatePlannedAttractionDTO);
        if(updatedPlannedAttraction.isPresent()){
            return new ResponseEntity<>(updatedPlannedAttraction.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
    @DeleteMapping
    public ResponseEntity<Long> deletePlannedAttraction(@PathVariable Long id){
        plannedAttractionService.deletePlannedAttraction(id);
        return new ResponseEntity<>(id, HttpStatus.OK );
    }

}
