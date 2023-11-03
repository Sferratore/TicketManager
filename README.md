# TicketManager
TicketManager is a Java Spring Boot application designed for event ticket management. It comprises several core components:

1. Ticket Class: This class models event tickets, featuring attributes such as ID, event name, date, buyer name, and price.

2. TicketRepository: Responsible for data persistence, it uses a Map to store ticket objects. It provides methods for adding, retrieving, updating, and removing tickets.

3. TicketService: As a service layer, it interacts with the repository to handle operations on tickets. It includes methods to add, retrieve, update, and remove tickets.

4. TicketController: This component is responsible for handling HTTP requests related to tickets. It exposes various endpoints, including listing all tickets, retrieving specific tickets, adding new tickets, updating existing tickets, and deleting tickets.

The application is built on the Spring framework, leveraging annotations for configuration and dependency injection. 
It implements a RESTful API, enabling clients to interact with the ticket management system via HTTP requests.
The project showcases a structured Spring Boot application, demonstrating best practices for organizing data management, service logic, and RESTful API endpoints.
