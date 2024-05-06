package com.example.demo.repositories;

import com.example.demo.enums.Category;
import com.example.demo.models.Dua;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DuaRepository extends JpaRepository<Dua, Long> {
    List<Dua> findByCategory(Category category);
}
