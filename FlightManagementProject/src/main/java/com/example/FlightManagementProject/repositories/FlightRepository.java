package com.example.FlightManagementProject.repositories;

import com.example.FlightManagementProject.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
