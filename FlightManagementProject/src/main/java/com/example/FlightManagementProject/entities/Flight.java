package com.example.FlightManagementProject.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "airline_company_id")
    private Airline airlineCompany;

    @ManyToOne
    @JoinColumn(name = "origin_country_id")
    private Country originCountry;

    @ManyToOne
    @JoinColumn(name = "destination_country_id")
    private Country destinationCountry;

    private String departureTime;
    private String landingTime;
    private int remainingTickets;
}