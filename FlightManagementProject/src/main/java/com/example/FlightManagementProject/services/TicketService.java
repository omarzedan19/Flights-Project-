package com.example.FlightManagementProject.services;


import com.example.FlightManagementProject.repositories.TicketRepository;
import com.example.FlightManagementProject.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;


    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }


    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id).orElse(null);
    }


    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }


    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}
