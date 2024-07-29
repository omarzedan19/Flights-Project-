package com.example.FlightManagementProject.services;

import com.example.FlightManagementProject.entities.Country;
import com.example.FlightManagementProject.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;


    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }


    public Country getCountryById(Long id) {
        return countryRepository.findById(id).orElse(null);
    }


    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }


    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }
}