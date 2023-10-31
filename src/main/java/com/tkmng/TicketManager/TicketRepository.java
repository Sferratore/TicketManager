package com.tkmng.TicketManager;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

// TicketRepository is a Spring repository class responsible for managing ticket data.
public class TicketRepository {

    private final Map<Long, Ticket> tickets = new HashMap<>();
    private Long currentId = 1L;

    // Constructor initializes the repository with an empty map.
    public TicketRepository() {
    }

    // Method to add a new ticket to the repository.
    public void addTicket(Ticket ticket) {
        ticket.setId(currentId++);
        tickets.put(ticket.getId(), ticket);
    }

    // Method to retrieve a collection of all tickets from the repository.
    public Collection<Ticket> getAllTickets() {
        return tickets.values();
    }

    // Method to retrieve a specific ticket by its ID from the repository.
    public Ticket getTicketFromId(Long id) {
        return tickets.get(id);
    }

    // Method to update an existing ticket in the repository.
    public void updateTicket(Ticket ticket) {
        if (tickets.containsKey(ticket.getId())) {
            tickets.put(ticket.getId(), ticket);
        }
    }

    // Method to remove a ticket by its ID from the repository.
    public void removeTicket(Long id) {
        tickets.remove(id);
    }
}
