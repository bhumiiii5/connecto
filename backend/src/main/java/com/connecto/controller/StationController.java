package com.connecto.controller;

import com.connecto.entity.Station;
import com.connecto.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/stations")
@CrossOrigin(origins = "*")
public class StationController {
    
    @Autowired
    private StationRepository stationRepository;
    
    @GetMapping
    public List<Station> getAllStations() {
        return stationRepository.findAll();
    }
    
    @GetMapping("/available")
    public List<Station> getAvailableStations() {
        return stationRepository.findByAvailableTrue();
    }
}

