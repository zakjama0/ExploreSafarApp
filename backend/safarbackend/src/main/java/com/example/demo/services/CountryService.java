package com.example.demo.services;

import com.example.demo.enums.Continent;
import com.example.demo.enums.Region;
import com.example.demo.models.Attraction;
import com.example.demo.models.Country;
import com.example.demo.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public List<Country> getAllCountries(){
       return countryRepository.findAll();
    }
    public Optional<Country> getCountryById(long id){
        return countryRepository.findById(id);
    }

    public List<Country> getCountriesByRegion(Region region){
        return countryRepository.findByRegion(region);
    }

    public List<Country> getCountriesByContinent(Continent continent){
        return countryRepository.findByContinent(continent);
    }

}
