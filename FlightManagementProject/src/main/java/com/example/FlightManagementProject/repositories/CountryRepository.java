package com.example.FlightManagementProject.repositories;

import com.example.FlightManagementProject.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}