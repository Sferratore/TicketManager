import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

// TicketService is a Spring service class responsible for managing ticket-related data and operations.
@Service
public class TicketService {

    private static TicketRepository ticketRepository = new TicketRepository();

    // Constructor initializes the service with some sample ticket data.
    public TicketService() {
        ticketRepository.addTicket(new Ticket(1L, "Concert", LocalDate.of(2023, 10, 30), "John Doe", 50.0));
        ticketRepository.addTicket(new Ticket(2L, "Movie Premiere", LocalDate.of(2023, 11, 5), "Jane Smith", 25.0));
    }

    // Method to add a new ticket.
    public void addTicket(Ticket ticket) {
        ticketRepository.addTicket(ticket);
    }

    // Method to retrieve a collection of all tickets.
    public Collection<Ticket> getAllTickets() {
        return ticketRepository.getAllTickets();
    }

    // Method to retrieve a specific ticket by its ID.
    public Ticket getTicketFromId(Long id) {
        return ticketRepository.getTicketFromId(id);
    }

    // Method to update an existing ticket.
    public void updateTicket(Ticket ticket) {
        ticketRepository.updateTicket(ticket);
    }

    // Method to remove a ticket by its ID.
    public void removeTicket(Long id) {
        ticketRepository.removeTicket(id);
    }
}
