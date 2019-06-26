package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/year/{year}")
    public List<Whisky> getByYear(@PathVariable int year){
        return whiskyRepository.findByYear(year);
    }

    @GetMapping(value = "/age/{age}/distillery/{distillery}")
    public List<Whisky> getByAgeAndDistillery(@PathVariable int age, @PathVariable String distillery){
        return whiskyRepository.findByAgeAndDistilleryName(age, distillery);
    }

    @GetMapping(value = "/region/{region}")
    public List<Whisky> getByRegion(@PathVariable String region){
        return whiskyRepository.findByDistilleryRegion(region);
    }
}
