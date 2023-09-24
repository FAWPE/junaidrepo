# JobPortal Project README
  * Overview
    - This README provides an overview of the project's key features and guidance on getting started.

# Key Properties
The JobPortal project consists of the following properties for job listings:

  - id: A unique identifier for each job listing.

  - title: The title of the job listing.

  - description: A detailed description of the job.

  - location: The location where the job is based.

  - salary: The offered salary for the job. 

 - companyEmail: The email address of the hiring company.

 - companyName: The name of the hiring company.

 - employerName: The name of the employer posting the job.

 - jobType: The type of job, represented as an enum.

- appliedDate:

  # Technologies Used
    * Backend:

      - Built with Java using the Spring Boot framework.
      - Utilizes H2 Database for data storage.
      - Implements CRUD operations using Spring Data JPA repositories.
      - Data Validation:

 * Uses validation annotations
  # Job Types Enum
      - The project includes an enum for job types, where you can specify various job categories (e.g., IT,    HR,  Sales, Marketing). These categories are stored as strings in the database, ensuring  readability and ease of use.