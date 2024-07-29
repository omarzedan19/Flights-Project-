package com.example.FlightManagementProject.controllers;

import com.example.FlightManagementProject.entities.Administrator;
import com.example.FlightManagementProject.services.AdministratorService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AdministratorController {
    @Autowired
    private AdministratorService administratorService;

    @GetMapping
    public List<Administrator> getAllAdministrators() {
        return administratorService.getAllAdministrators();
    }

    @GetMapping("/{id}")
    public Administrator getAdministratorById(@PathVariable Integer id) {
        return administratorService.getAdministratorById(id);
    }

    @PostMapping
    public Administrator createAdministrator(@RequestBody Administrator administrator) {
        return administratorService.saveAdministrator(administrator);
    }

    @PutMapping("/{id}")
    public Administrator updateAdministrator(@PathVariable Integer id, @RequestBody @NotNull Administrator administrator) {
        administrator.setId(id);
        return administratorService.saveAdministrator(administrator);
    }

    @DeleteMapping("/{id}")
    public void deleteAdministrator(@PathVariable Integer id) {
        administratorService.deleteAdministrator(id);
    }
}
