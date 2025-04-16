# ToDo Application

A simple and efficient task management application built with Spring Boot, Thymeleaf, and MySQL.

## Overview

This ToDo application allows users to create, manage, toggle completion status, and delete tasks through a clean and intuitive web interface. The application follows the MVC (Model-View-Controller) architecture pattern for organized code structure and maintainability.

## Technologies Used

- **Spring Boot**: Backend framework for building the Java application
- **Thymeleaf**: Server-side Java template engine for HTML rendering
- **MySQL**: Database for storing task data
- **Spring Data JPA**: For data persistence and database operations
- **Bootstrap 5**: For responsive and attractive frontend design
- **Maven**: Dependency management and build tool

## Project Structure

The application follows a standard Spring Boot project structure:

```
com.example.todo/
├── TaskController/       # Handles HTTP requests and responses
├── Services/             # Contains business logic
├── models/               # Data models/entities
├── repository/           # Database access interfaces
└── resources/            # Templates and application properties
```

## Application Flow

1. **Model**: `Task` entity with properties like id, title, and completion status
2. **Repository**: `TaskRepository` extends JPA Repository for database operations
3. **Service**: `TaskService` handles business logic between controller and repository
4. **Controller**: `TaskController` processes user requests and returns view templates
5. **View**: Thymeleaf templates for user interface

## Features

- Create new tasks
- View all tasks in a clean interface
- Toggle task completion status
- Delete tasks
- Completed tasks are displayed with strikethrough styling

## Setup Instructions

### Prerequisites

- JDK 11 or higher
- Maven
- MySQL Server

### Database Setup

1. Create a new MySQL database named `todoapp`:
   ```sql
   CREATE DATABASE todoapp;
   ```

2. Ensure your MySQL credentials match those in `application.properties` or update the file with your credentials.

### Building and Running the Application

1. Clone the repository:
   ```
   git clone <repository-url>
   cd todo-application
   ```

2. Build the application using Maven:
   ```
   mvn clean install
   ```

3. Run the application:
   ```
   mvn spring-boot:run
   ```
   
   Alternatively, you can run the JAR file directly:
   ```
   java -jar target/todoApp-0.0.1-SNAPSHOT.jar
   ```

4. Access the application in your web browser:
   ```
   http://localhost:8080/
   ```

## API Endpoints

- `GET /`: Retrieves all tasks and displays them
- `POST /`: Creates a new task
- `GET /{id}/delete`: Deletes a task by ID
- `GET /{id}/toggle`: Toggles the completion status of a task by ID

## Development

### Adding a New Feature

1. Create or modify the entity model (if necessary)
2. Update the repository interface (if necessary)
3. Add business logic in the service layer
4. Create controller methods to handle HTTP requests
5. Design and implement the view templates

### Database Configuration

Database configuration is maintained in the `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todoapp
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

## Future Enhancements

Potential improvements for the application:
- User authentication and authorization
- Task categories or tags
- Due dates for tasks
- Task priority levels
- Search and filter functionality
- Task descriptions or notes

## License

[MIT License](LICENSE)
