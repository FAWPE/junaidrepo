# User Management Project

## Project Overview

The User Management project is a Java-based application that provides a basic user management system. It includes packages for organizing code related to different aspects of the project, such as handling user data, defining API endpoints, implementing business logic, and interacting with a database.

## Packages

### `model`

The `model` package contains classes that define the structure of user data. The primary class in this package is:

- `User`: Represents a user entity with properties like UserId username DateOfBirth email Phone Number DateTime 

### `controller`

The `controller` package contains classes responsible for handling API endpoints and user interactions. The primary class in this package is:

- `UserController`: Defines and handles RESTful API endpoints for user management, such as creating, updating, deleting, and retrieving users.

### `service`

The `service` package contains classes that implement the business logic of the application. The primary classes in this package include:

- `UserService`: Provides methods for performing various operations on user data, such as user creation, retrieval, and validation.

### `repo`

The `repo` package contains the repository interface that extends the `CrudRepository` interface. This interface is used to interact with the database and provides CRUD (Create, Read, Update, Delete) operations for user data. The project uses an H2 database.

- `IRepo`: Interface that extends `CrudRepository` for user data operations.

## Technologies Used

- Java
- Spring Framework
- H2 Database

## Getting Started

To run the User Management project, follow these steps:

1. Clone the repository to your local machine.
2. Configure the database connection in your application properties.
3. Build and run the project.

## Usage

- Use the API endpoints defined in the `UserController` to manage user data.


