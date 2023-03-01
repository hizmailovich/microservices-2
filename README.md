# Microservices-2
This is a simple "Bookstore App" that contains:
- Book microservice
- Author microservice
- Spring Cloud API Gateway
- Netflix Eureka service registry

## Glossary
1. Author: name, surname
2. Book: title, author

## Endpoints

| Method     | Path                                                 | Description     |
|------------|------------------------------------------------------|-----------------|
| ```GET```  | ```localhost:8080/author-service/api/v1/authors```   | Get all authors |
| ```GET```  | ```localhost:8080/book-service/api/v1/books/books``` | Get all books   |
| ```POST``` | ```localhost:8080/author-service/api/v1/authors```   | Add new author  |
| ```POST``` | ```localhost:8080/book-service/api/v1/books```       | Add new book    |

## Implemented patterns
### Service registry
The service registry pattern is a key part of service discovery. The registry is a database containing the network locations of service instances. A service registry needs to be highly available and up-to-date. One of the most popular implementations of this pattern is Eureka Service Registry.

### Api gateway
This pattern is a service that provides a single-entry point for certain groups of microservices. It's similar to the Facade pattern from object-oriented design, but in this case, it's part of a distributed system.
