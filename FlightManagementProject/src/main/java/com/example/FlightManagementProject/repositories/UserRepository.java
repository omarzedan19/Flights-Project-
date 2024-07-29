package com.example.FlightManagementProject.repositories;


import com.example.FlightManagementProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}