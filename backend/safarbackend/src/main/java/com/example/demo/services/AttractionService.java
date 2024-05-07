package com.example.demo.services;

import com.example.demo.models.Attraction;
import com.example.demo.repositories.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttractionService {
    @Autowired
    AttractionRepository attractionRepository;

    public List<Attraction> getAllAttractions(){
        return attractionRepository.findAll();
    }

    public Optional<Attraction> getAttractionById(long id){
        return attractionRepository.findById(id);
    }

    public List<Attraction> getAttractionsByCityId(Long cityId){
        return attractionRepository.findByCityId(cityId);
    }

    public List<Attraction> getAttractionsByCountryId(Long countryId){
        return attractionRepository.findByCountryId(countryId);
    }
}
