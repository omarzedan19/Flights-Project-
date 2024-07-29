package com.example.FlightManagementProject.repositories;

import com.example.FlightManagementProject.entities.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineRepository extends JpaRepository<Airline, Long> {
}