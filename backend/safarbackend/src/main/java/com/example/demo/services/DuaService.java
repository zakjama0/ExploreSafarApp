package com.example.demo.services;

import com.example.demo.enums.Category;
import com.example.demo.models.Dua;
import com.example.demo.repositories.DuaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DuaService {

    private final DuaRepository duaRepository;

    @Autowired
    public DuaService(DuaRepository duaRepository) {
        this.duaRepository = duaRepository;
    }

    public List<Dua> getAllDuas(){
        return duaRepository.findAll();
    }

    public Optional<Dua> getDuaById(Long id) {
        return duaRepository.findById(id);
    }

    public List<Dua> getDuaByCategory(Category category){
        return duaRepository.findByCategory(category);
    }
}
