package com.example.demo.services;

import com.example.demo.models.Attraction;
import com.example.demo.repositories.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttractionService {
    @Autowired
    AttractionRepository attractionRepository;

    public List<Attraction> getAllAttractions(){
        return attractionRepository.findAll();
    }

    public List<Attraction> getAttractionsByCityId(Long cityId){
        return attractionRepository.findByCityId(cityId);
    }

//    GETBYAVGRATING



}
