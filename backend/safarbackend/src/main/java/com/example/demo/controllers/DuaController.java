package com.example.demo.controllers;

import com.example.demo.enums.Category;
import com.example.demo.models.Dua;
import com.example.demo.services.DuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/duas")
public class DuaController {
    @Autowired
    DuaService duaService;
    @GetMapping
    public ResponseEntity<List<Dua>> getAllDuas(
            @RequestParam(required = false, name = "category") Category category
    ){
        if (category != null){
            return new ResponseEntity<>(duaService.getDuaByCategory(category), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(duaService.getAllDuas(), HttpStatus.OK);
        }
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Dua> getDuaById(@PathVariable Long id){
        Optional<Dua> gotItemById = duaService.getDuaById(id);
        if(gotItemById.isPresent()){
            return new ResponseEntity<>(gotItemById.get(),HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }


}
