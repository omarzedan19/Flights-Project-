package com.example.FlightManagementProject.services;

import com.example.FlightManagementProject.entities.Administrator;
import com.example.FlightManagementProject.repositories.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdministratorService {
    @Autowired
    private AdministratorRepository administratorRepository;


    public List<Administrator> getAllAdministrators() {
        return administratorRepository.findAll();
    }


    public Administrator getAdministratorById(Integer id) {
        return administratorRepository.findById(id).orElse(null);
    }


    public Administrator saveAdministrator(Administrator administrator) {
        return administratorRepository.save(administrator);
    }


    public void deleteAdministrator(Integer id) {
        administratorRepository.deleteById(id);
    }
}
