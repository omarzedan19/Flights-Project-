package com.example.FlightManagementProject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String username;
    private String password;
}