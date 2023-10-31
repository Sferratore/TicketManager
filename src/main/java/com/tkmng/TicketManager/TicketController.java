package com.tkmng.TicketManager;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;

// TicketController is a Spring controller class responsible for handling HTTP requests related to tickets.
@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    // Handle HTTP GET requests to retrieve a list of tickets.
    @GetMapping
    public Collection<Ticket> ticketList() {
        return ticketService.getAllTickets();
    }

    // Handle HTTP GET requests to retrieve a specific ticket by its ID.
    @GetMapping("/{id}")
    public Ticket getTicket(@PathVariable Long id) {
        return ticketService.getTicketFromId(id);
    }

    // Handle HTTP POST requests to create a new ticket.
    @PostMapping
    public void newTicket(@RequestBody Ticket ticket) {
        ticketService.addTicket(ticket);
    }

    // Handle HTTP PUT requests to update an existing ticket.
    @PutMapping("/{id}")
    public void updateTicket(@RequestBody Ticket ticket) {
        ticketService.updateTicket(ticket);
    }

    // Handle HTTP DELETE requests to delete a ticket by its ID.
    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
        ticketService.removeTicket(id);
    }
}
