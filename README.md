# Simple Online Bookstore RESTful API - Task1 medium level

This is a simple online bookstore RESTful API implemented using Spring Boot and Hibernate. It allows users to perform CRUD operations on books, authors, and genres. Users can also search for books by title, author, or genre.

## Features

- CRUD operations on books, authors, and genres.
- Search for books by title, author, or genre.

## Technologies Used

- Java
- Spring Boot
- Hibernate
- PostgreSQL (can be easily switched to another relational database)
- Maven

## Setup and Running

1. **Clone the repository:**

2. **Navigate to the project directory:**

3. **Configure the Database:**

- Modify the `application.properties` file located in `src/main/resources` to configure the database connection details.

4. **Run the Application:**

- Run the following Maven command to build and run the application:

  ```
  mvn spring-boot:run
  ```

5. **Test the Endpoints:**

- Once the application is running, you can test the endpoints using tools like Postman, cURL, or a web browser. The base URL for the API is `http://localhost:8080/api`.

6. **(Optional) Run Unit Tests:**

- You can run the unit tests using the following Maven command:

  ```
  mvn test
  ```
