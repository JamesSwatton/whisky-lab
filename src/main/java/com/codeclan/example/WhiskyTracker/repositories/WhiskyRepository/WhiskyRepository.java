package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {

    //  Get all the whiskies for a particular year
    List<Whisky> findByYear(int year);

    List<Whisky> findByAgeAndDistilleryName(int age, String distillery);

    List<Whisky> findByDistilleryRegion(String region);
}
