package com.example.demo.services;

import com.example.demo.models.City;
import com.example.demo.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    public List<City> getAllCitiesInACountry(Long countryId) {
        return cityRepository.findByCountryId(countryId);
    }

    public Optional<City> getCityById(Long cityId) {
        return cityRepository.findById(cityId);
    }
}
