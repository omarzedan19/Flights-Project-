package com.example.FlightManagementProject.repositories;


import com.example.FlightManagementProject.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}