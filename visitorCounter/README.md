# Frameworks and language used
* SpringBoot framework
* Java Language

# Data flow
* visitorCounter Class
   - this class starts the springapplication
* Visitor Class
  - this class includes all the user properties
* urlhitController
  - this class includes all the CRUD API's
* visitorRepo
  - this class includes the data storage which is List
# Data Structure Used
* Hashmap
# Project Sumarry
    - Project Title: VisitorCounter API

Summary:
The VisitorCounter API is a powerful web service that provides detailed insights into visitor activity for a specified URL. When called, this API returns both the username and hit count for the given URL. The project is structured using various classes, each serving a distinct purpose.

Classes:

URLHitController: This class serves as the controller for all API endpoints, handling incoming requests and directing them to the appropriate service class.

URLHitService: The business logic of the API is encapsulated within this class. It manages the tasks related to the API functionality, including retrieving hit counts and usernames.

Visitor: This class defines the structure of a visitor, storing properties like the username and hit count. Instances of this class hold the data returned by the API.

DataSource: The data storage mechanism for this project is implemented in the DataSource class, which utilizes a HashMap to store visitor data.

VisitorRepo: This class acts as an intermediary between the service class (URLHitService) and the data source (DataSource). It provides methods to access and manipulate data stored in the HashMap.
