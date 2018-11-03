# Choreography-based Saga Pattern: Data consistency in Microservices

This is a transaction management sample solution that demonstrates how to maintain data consistency across services in a microservices architecture by using [Saga](https://microservices.io/patterns/data/saga.html) pattern.

Services are implemented through choreography-based sagas, which means that all participants are loosely coupled as they don't have direct knowledge of each other. Participants 'simply' subscribe to each other’s events and respond accordingly.

## Architecture Overview
![Architecture Overview](./images/architecture_overview.JPG)

## References

- [Book: Microservices Patterns](https://www.manning.com/books/microservices-patterns)
- [microXchg 2018: Managing data consistency in a microservice architecture using Sagas](https://www.youtube.com/watch?v=7dy5WPSv2DQ)
- [Eventuate Tram Customers and Orders](https://github.com/eventuate-tram/eventuate-tram-examples-customers-and-orders)
