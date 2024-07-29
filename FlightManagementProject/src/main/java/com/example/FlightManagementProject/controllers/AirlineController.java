package com.example.FlightManagementProject.controllers;


import com.example.FlightManagementProject.services.AirlineService;
import com.example.FlightManagementProject.entities.Airline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airlineCompanies")
public class AirlineController {
    @Autowired
    private AirlineService airlineCompanyService;

    @GetMapping
    public List<Airline> getAllAirlineCompanies() {
        return airlineCompanyService.getAllAirlineCompanies();
    }

    @GetMapping("/{id}")
    public Airline getAirlineCompanyById(@PathVariable Long id) {
        return airlineCompanyService.getAirlineCompanyById(id);
    }

    @PostMapping
    public Airline createAirlineCompany(@RequestBody Airline airlineCompany) {
        return airlineCompanyService.saveAirlineCompany(airlineCompany);
    }

    @PutMapping("/{id}")
    public Airline updateAirlineCompany(@PathVariable Long id, @RequestBody Airline airlineCompany) {
        airlineCompany.setId(id);
        return airlineCompanyService.saveAirlineCompany(airlineCompany);
    }

    @DeleteMapping("/{id}")
    public void deleteAirlineCompany(@PathVariable Long id) {
        airlineCompanyService.deleteAirlineCompany(id);
    }
}