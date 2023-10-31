package com.tkmng.TicketManager;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

// Ticket is the main model class representing event tickets.
public class Ticket {
    private Long id;
    private String eventName;
    private LocalDate eventDate;
    private String buyerName;
    private double price;

    // Default constructor
    public Ticket() {
    }

    // Parameterized constructor
    public Ticket(Long id, String eventName, LocalDate eventDate, String buyerName, double price) {
        this.id = id;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.buyerName = buyerName;
        this.price = price;
    }

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for eventName
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    // Getter and Setter for eventDate
    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    // Getter and Setter for buyerName
    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method for textual representation
    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                ", buyerName='" + buyerName + '\'' +
                ", price=" + price +
                '}';
    }

    // Method to convert the Ticket object to a HashMap
    public Map<String, Object> toHashMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("eventName", eventName);
        map.put("eventDate", eventDate);
        map.put("buyerName", buyerName);
        map.put("price", price);
        return map;
    }
}
