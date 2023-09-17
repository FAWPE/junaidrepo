# Frameworks and language used
* SpringBoot framework
* Java Language

# Data flow
* Controller Package
  - RestrauntController Class
     - This class Controles all the API's
* Repo Package
  - RestrauntData
    - this class stores the data in the hashmap
  -RestrauntRepo
    - this class refers the RestrauntData class
* Entity Package
  -Restraunt Class
    - this class includes all the restraunt properties
  -Catagory Enum
    -this enum contains all the categories of food
* Service Package
  -RestaruntService Class
    - this class handles the all logic of API's

# Data Structure Used
* Hashmap
# Project Sumarry
  * Project Title: Restaurant Application

com.example.restaurantapplication
├── controller
│   └── RestaurantController.java
├── entity
│   ├── Restaurant.java
│   └── Category.java
├── service
│   └── RestaurantService.java
├── repo
│   ├── RestaurantData.java
│   └── RestaurantRepo.java


* controller Package:

RestaurantController.java: This class serves as the controller for all API endpoints related to restaurants. It handles incoming requests and directs them to the appropriate service class.

* entity Package:

Restaurant.java: The Restaurant class defines the structure of a restaurant entity, including properties such as restaurant name, address, rating, etc.
Category.java: The Category enum contains different categories for restaurants (e.g., VEG, NON-VEG, VEGAN).

* service Package:

RestaurantService.java: The RestaurantService class contains the business logic for handling API requests related to restaurants. It encapsulates the logic for creating, updating, and retrieving restaurant data.

* repo Package:

RestaurantData.java: This class serves as a data storage mechanism for restaurant information. It may use collections or a database to store and manage restaurant data.

RestaurantRepo.java: The RestaurantRepo class acts as an intermediary between the service class (RestaurantService) and the data source (RestaurantData). It provides methods for accessing and manipulating restaurant data.
