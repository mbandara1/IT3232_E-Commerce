# E-Commerce-Practical-Day-03
# E-CommerceDay3
# Student Management System

This is a Spring Boot project that manages student data. The project consists of a `model` package containing a `Student` class and a `controller` package that provides various methods to handle student-related operations.

## Features
- Create sample `Student` objects
- Retrieve a single student
- Retrieve multiple students
- Find a student by registration number
- Find students whose age is between 20 and 23
- Sort students by their GPA
- Implement full CRUD operations for students

## Technologies Used
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- H2 Database (or MySQL, PostgreSQL as per configuration)
- Lombok

## Project Structure
```
SpringBoot-Student-Management/
│-- src/main/java/com/example/studentmanagement
│   ├── model
│   │   ├── Student.java
│   ├── controller
│   │   ├── StudentController.java
│   ├── repository
│   │   ├── StudentRepository.java
│   ├── service
│   │   ├── StudentService.java
│-- src/main/resources/
│   ├── application.properties
│-- pom.xml
│-- README.md
```

## API Endpoints
| Method | Endpoint                  | Description |
|--------|---------------------------|-------------|
| GET    | `/students`                | Get all students |
| GET    | `/students/{id}`            | Get student by ID |
| GET    | `/students/regno/{regno}`   | Find student by registration number |
| GET    | `/students/age-range`       | Find students aged between 20 and 23 |
| GET    | `/students/sorted`          | Get students sorted by GPA |
| POST   | `/students`                 | Add a new student |
| PUT    | `/students/{id}`            | Update an existing student |
| DELETE | `/students/{id}`            | Delete a student |

## Running the Application
1. Clone the repository:
   ```sh
https://github.com/Apsara2001/E-CommerceDay3.git



2. The application will start on `http://localhost:8080`

## Example Output
### 1. Getting all students
```
[
    {
        "id": 1,
        "name": "John Doe",
        "age": 21,
        "regNo": "ST1234",
        "gpa": 3.8
    },
    {
        "id": 2,
        "name": "Jane Smith",
        "age": 22,
        "regNo": "ST5678",
        "gpa": 3.5
    }
]
```

### 2. Finding a student by regNo
```
{
    "id": 1,
    "name": "John Doe",
    "age": 21,
    "regNo": "ST1234",
    "gpa": 3.8
}
```

### 3. Sorting students by GPA
```
[
    {
        "id": 2,
        "name": "Jane Smith",
        "age": 22,
        "regNo": "ST5678",
        "gpa": 3.5
    },
    {
        "id": 1,
        "name": "John Doe",
        "age": 21,
        "regNo": "ST1234",
        "gpa": 3.8
    }
]
```


## Screenshots
![1](https://github.com/user-attachments/assets/84881694-8ed0-4972-8b87-d9cdea8bfc90)
![3](https://github.com/user-attachments/assets/bdf53d75-f2d2-4216-bc6b-4e8c9166c99d)
![2](https://github.com/user-attachments/assets/27d1b3dd-d95c-4ddb-8877-97abea2f3c5b)
![4](https://github.com/user-attachments/assets/3ef45c85-6fb1-4f26-b64c-17e4e90ab8a0)
![5](https://github.com/user-attachments/assets/7aab7f57-eef9-4541-a4bd-2edd84d02cb8)
![6](https://github.com/user-attachments/assets/49131e3a-9050-4630-a8fc-39093cac5c8b)
![7](https://github.com/user-attachments/assets/28d7b18c-a857-4ca7-9d51-b1b1f41861cc)
![8](https://github.com/user-attachments/assets/e4440790-56cc-470a-8fcc-0ffaefeb6d8c)
![9](https://github.com/user-attachments/assets/4c0b63a2-8afc-4038-aefe-09e05c12eed0)







