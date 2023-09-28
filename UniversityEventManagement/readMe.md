# University Event Management

## Frameworks and Language Used
- **Language**: Java
- **Framework**: Spring Boot
- **Database**: H2 Database (for development and testing purposes)

## Data Flow

### Controller Package
- **StudentController**: This class contains APIs for managing student-related operations.
- **EventController**: This class contains APIs for managing event-related operations.

### Model Package
- **Student**: This class represents the Student entity and contains properties such as student ID, name, email, etc.
- **Event**: This class represents the Event entity and contains properties such as event ID, title, description, date, etc.

### Service Package
- **StudentService**: This class contains the business logic for student-related operations.
- **EventService**: This class contains the business logic for event-related operations.

### Repo Package
- **IStudentRepo**: This interface extends JpaRepository and provides CRUD operations for the Student entity.
- **IEventRepo**: This interface extends JpaRepository and provides CRUD operations for the Event entity.

## Data Structure Used
- **Data Structures**: ArrayList data structures are used internally by Spring Data JPA and are transparent to the developer. JPA repositories handle the mapping between Java objects and database tables.

## Project Summary
The "University Event Management" project is a Spring Boot-based application designed to manage university events and student information. It employs the Spring framework for building RESTful APIs and utilizes H2 Database for data storage during development and testing.

The project is organized into distinct packages, each serving a specific purpose. The Model package defines the data structures for Student and Event entities. The Controller package provides endpoints for interacting with these entities via HTTP requests. The Service package contains the business logic for managing students and events. Finally, the Repo package defines repository interfaces that extend JpaRepository to enable easy database operations.

This project allows you to create, read, update, and delete student and event records in a university event management system.

For more detailed information on how to use the APIs and interact with the project, please refer to the project's documentation and API documentation.
