package com.example.demo.controllers;

import com.example.demo.enums.Region;
import com.example.demo.models.Country;
import com.example.demo.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/countries")
public class CountryController {
    @Autowired
    CountryService countryService;

    @GetMapping
    public ResponseEntity<List<Country>> getAllCountries(){
        List<Country> countries = countryService.getAllCountries();
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Country>> getCountriesByRegion(@RequestParam(required = false, name = "region") Region region
    ){
        List<Country> countries = countryService.getCountriesByRegion(region);
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Country>> getCountriesByContinent(@PathVariable Long id){
        List<Country> countries = countryService.getCountriesByContinent(id);
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }
}
