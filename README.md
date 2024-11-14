# Testdemo
Junit and mockito demo
JUnit is one of the most widely used testing frameworks in the Java ecosystem. JUnit provides a simple and standardized way to write test cases, execute them, and report the results.

Asserts, on the other hand, is not a testing framework but rather a library that complements testing frameworks like JUnit. It focuses on providing fluent and expressive assertions, enhancing the readability and maintainability of your test code


JUnit and Assert are both popular tools used in Java for testing, but they serve different purposes and have distinct features.

Key Testing Annotations in Spring Boot
• @SpringBootTest: Used to create an application context and load the full application for integration tests. Useful in Integration Testing.
• @DataJpaTest: Used to test JPA repositories, configuring an in-memory database for the test. Useful in Unit Testing Service Layer and Persistence Layer.
• @TestConfiguration: Used to define extra beans or configurations for tests.
• @WebMvcTest: Used for testing Spring MVC controllers. It initializes only the web layer and not the entire context. Useful in Unit Testing Controller layer
• @AutoConfigureTestDatabase: Used to replace the actual database with an embedded database during tests.