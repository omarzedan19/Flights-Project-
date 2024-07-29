package com.example.FlightManagementProject.services;


import com.example.FlightManagementProject.entities.*;
import com.example.FlightManagementProject.repositories.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AirlineService {
    @Autowired
    private AirlineRepository airlineCompanyRepository;


    public List<Airline> getAllAirlineCompanies() {
        return airlineCompanyRepository.findAll();
    }


    public Airline getAirlineCompanyById(Long id) {
        return airlineCompanyRepository.findById(id).orElse(null);
    }


    public Airline saveAirlineCompany(Airline airlineCompany) {
        return airlineCompanyRepository.save(airlineCompany);
    }


    public void deleteAirlineCompany(Long id) {
        airlineCompanyRepository.deleteById(id);
    }
}