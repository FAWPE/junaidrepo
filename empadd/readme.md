# Employee Address Management

## Frameworks and Language Used
- Language: Java
- Framework: Spring Boot
- Database: SQL Database (for development and testing purposes)

## Data Flow
### Controller Package
- **AddressController:** This class contains APIs for managing address-related operations.
- **EmployeeController:** This class contains APIs for managing employee-related operations.

### Model Package
- **Address:** This class represents the Address entity and contains properties such as address ID, street, city, state, zip code, etc.
- **Employee:** This class represents the Employee entity and contains properties such as employee ID, name, email, etc.

### Service Package
- **AddressService:** This class contains the business logic for address-related operations.
- **EmployeeService:** This class contains the business logic for employee-related operations.

### Repo Package
- **IAddressRepo:** This interface provides CRUD operations for the Address entity.
- **IEmployeeRepo:** This interface provides CRUD operations for the Employee entity.

## Data Structure Used
- **Data Structures:** ArrayList data structures are used internally by Spring Data JPA and are transparent to the developer. JPA repositories handle the mapping between Java objects and database tables.

## Project Summary
The "Employee Address Management" project is a Spring Boot-based application designed to manage employee information and their corresponding addresses. It employs the Spring framework for building RESTful APIs and utilizes an SQL database for data storage during development and testing.

The project is organized into distinct packages, each serving a specific purpose. The Model package defines the data structures for Address and Employee entities. The Controller package provides endpoints for interacting with these entities via HTTP requests. The Service package contains the business logic for managing addresses and employees. Finally, the Repo package defines repository interfaces that provide CRUD operations for the Address and Employee entities.

This project allows you to create, read, update, and delete employee and address records in an employee address management system using an SQL database.

For more detailed information on how to use the APIs and interact with the project, please refer to the project's documentation and API documentation.
