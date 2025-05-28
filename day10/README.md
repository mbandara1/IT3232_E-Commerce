# Department Management Service

A Spring Boot REST API service for managing department information with comprehensive error handling and JPA integration.

## Overview

This service provides CRUD operations for department management with built-in exception handling and data validation. It's designed for educational institutions or organizations that need to manage departmental information and employee associations.

## Architecture

The application follows a layered architecture pattern:

- **Model Layer**: JPA entities with proper relationships
- **Repository Layer**: Spring Data JPA repositories
- **Service Layer**: Business logic implementation
- **Exception Handler**: Centralized error handling

## Features

- ✅ **Department CRUD Operations**
  - Retrieve all departments
  - Get department by ID
  - Add new departments with duplicate validation

- ✅ **Robust Error Handling**
  - Entity not found exceptions
  - Duplicate key validation
  - Generic exception handling
  - Structured error responses

- ✅ **Data Validation**
  - Unique department ID enforcement
  - Required field validation
  - Proper HTTP status codes

## API Endpoints

### Get All Departments
```http
GET /api/departments

```
![Screenshot (1135)](https://github.com/user-attachments/assets/1476c891-6fb9-4507-bc49-7609b7ebc8d3)

Returns a list of all departments.

### Get Department by ID
```http
GET /api/departments/{id}
```
![Screenshot (1136)](https://github.com/user-attachments/assets/ac939eee-9945-4c42-be7b-9e5c7fb66640)

Returns a specific department by ID.

**Error Response (404):**

![Screenshot (1133)](https://github.com/user-attachments/assets/42aa5090-59e5-40c0-844e-9db51ee732c4)

### Add New Department
```http
POST /api/departments
```
Creates a new department.

![Screenshot (1137)](https://github.com/user-attachments/assets/2ef22533-4bee-47e3-99c1-3841604b6abe)

**Error Response (400) - Duplicate ID:**

![Screenshot (1134)](https://github.com/user-attachments/assets/7994db7d-97bb-4c1a-900c-4d9251b0d6c2)

## Data Model

### Error Response Model
```java
- statusCode (Integer): HTTP status code
- errorMessage (String): Descriptive error message
```

## Technology Stack

- **Framework**: Spring Boot
- **ORM**: Spring Data JPA / Hibernate
- **Database**: JPA compatible (MySQL, PostgreSQL, H2, etc.)
- **Exception Handling**: Spring Boot's `@RestControllerAdvice`
- **Validation**: Custom business logic validation

## Exception Handling

The service implements comprehensive exception handling:

| Exception Type | HTTP Status | Description |
|----------------|-------------|-------------|
| `EntityNotFoundException` | 404 | Department not found |
| `DuplicateKeyException` | 400 | Duplicate department ID |
| `Exception` | 500 | Generic server errors |

## Getting Started

### Prerequisites
- Java 17 or higher
- Spring Boot 3.x
- JPA compatible database

### Configuration
Update your `application.properties` with database configuration:

```properties
# Database Configuration
spring.application.name=employeeapp
spring.datasource.url=jdbc:mysql://localhost:3306/employee
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
```

### Running the Application
```bash
mvn spring-boot:run
```

## Package Structure

```
lk.ac.vau.fas.ict/
├── model/
│   ├── Department.java
│   └── ErrorResponse.java
├── repo/
│   └── DepartmentRepo.java
├── service/
│   └── DepartmentService.java
└── exceptionHandler/
    └── GenericExceptionHandler.java
```

## Business Logic

### Department Addition
1. Validates department ID uniqueness
2. Throws `DuplicateKeyException` if ID exists
3. Saves department to database
4. Returns success message

### Department Retrieval
1. Checks if department exists by ID
2. Throws `EntityNotFoundException` if not found
3. Returns department data

## Error Response Format

All errors follow a consistent JSON structure:
```json
{
  "statusCode": <HTTP_STATUS_CODE>,
  "errorMessage": "<DESCRIPTIVE_MESSAGE>"
}
```

## Future Enhancements

- [ ] Department update functionality
- [ ] Department deletion with cascade handling
- [ ] Employee management integration
- [ ] Search and filtering capabilities
- [ ] Pagination support
- [ ] Input validation annotations
- [ ] Unit and integration tests

## Contributing

1. Follow Java coding conventions
2. Maintain consistent error handling patterns
3. Add proper documentation for new features
4. Include appropriate exception handling

## License

This project is  academic curriculum.

---

