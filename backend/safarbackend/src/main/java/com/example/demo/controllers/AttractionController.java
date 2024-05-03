package com.example.demo.controllers;

import com.example.demo.models.Attraction;
import com.example.demo.models.User;
import com.example.demo.services.AttractionService;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/attractions")
public class AttractionController {
    @Autowired
    AttractionService attractionService;

    @GetMapping
    public ResponseEntity<List<Attraction>> getAllAttractions(){
        List<Attraction> attractions = attractionService.getAllAttractions();
        return new ResponseEntity<>(attractions, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<Attraction>> getAllAttractionsByCity(@PathVariable Long id){
        List<Attraction> attractions = attractionService.getAttractionsByCityId(id);
        return new ResponseEntity<>(attractions, HttpStatus.OK);
    }

//    Avg Rating Controller
}
