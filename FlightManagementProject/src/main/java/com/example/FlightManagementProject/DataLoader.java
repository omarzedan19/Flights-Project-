//package com.example.FlightManagementProject;
//
//
//
//import com.example.FlightManagementProject.entities.Country;
//import com.example.FlightManagementProject.repositories.CountryRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataLoader implements CommandLineRunner {
//    @Autowired
//    private CountryRepository countryRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        Country country1 = new Country();
//        country1.setName("Israel");
//        countryRepository.save(country1);
//
//        Country country2 = new Country();
//        country2.setName("USA");
//        countryRepository.save(country2);
//
//
//    }
//}