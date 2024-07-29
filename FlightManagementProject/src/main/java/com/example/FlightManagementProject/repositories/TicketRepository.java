package com.example.FlightManagementProject.repositories;


import com.example.FlightManagementProject.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}