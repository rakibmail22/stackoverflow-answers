# Getting Started
This repo is intended to observe the behavior of OpenEntityManagerInViewInterceptor

This interceptor can be turned of with

spring.jpa.open-in-view=false

However while using with spring data rest this interceptor stays open even if the property is set false.
@RepositoryRestController is used to determine the behavior of RepositoryEntityController class.

### Reference Documentation
For further reference, please consider the following sections:

### Guides
The following guides illustrate how to use some features concretely:
* [Observe Behavior of Jpa Open In View](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/orm/jpa/support/OpenEntityManagerInViewInterceptor.html)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Building a Hypermedia-Driven RESTful Web Service](https://spring.io/guides/gs/rest-hateoas/)
* [RepositoryRestController](https://docs.spring.io/spring-data/rest/docs/current/api/org/springframework/data/rest/webmvc/RepositoryRestController.html)
* [RepositoryEntityController](https://docs.spring.io/spring-data/rest/docs/1.1.0.M1/api/org/springframework/data/rest/webmvc/RepositoryEntityController.html)