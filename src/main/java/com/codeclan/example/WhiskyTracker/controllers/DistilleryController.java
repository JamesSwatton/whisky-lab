package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "/region/{region}")
    public List<Distillery> getRegion(@PathVariable String region){
        return distilleryRepository.findByRegion(region);
    }

    @GetMapping(value = "/withwhiskiesaged/{age}")
    public List<Distillery> getByWhiskiesAged(@PathVariable int age){
        return distilleryRepository.findByWhiskiesAge(age);
    }

}
