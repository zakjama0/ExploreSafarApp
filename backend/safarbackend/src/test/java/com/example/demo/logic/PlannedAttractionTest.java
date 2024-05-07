package com.example.demo.logic;

import com.example.demo.models.PlannedAttraction;
import com.example.demo.repositories.PlannedAttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PlannedAttractionTest {

    @Autowired
    PlannedAttractionRepository plannedAttractionRepository;

}
