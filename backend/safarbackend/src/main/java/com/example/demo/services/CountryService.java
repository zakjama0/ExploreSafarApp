package com.example.demo.services;

import com.example.demo.enums.Region;
import com.example.demo.models.Country;
import com.example.demo.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public List<Country> getAllCountries(){
       return countryRepository.findAll();
    }

    public List<Country> getCountriesByRegion(Region region){
        return countryRepository.findByRegion(region);
    }

    public List<Country> getCountriesByContinent(Long continentId){
        return countryRepository.findByContinentId(continentId);
    }

}
