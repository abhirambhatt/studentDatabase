# Student Database REST API

A simple REST API for managing student records using Spring Boot, JPA/Hibernate, and MySQL.

## Technologies
- Spring Boot 4.0.5
- Spring Data JPA
- Hibernate
- MySQL 9.6
- Maven

## API Endpoints

### Get All Students
GET /api/students

### Get Student By ID
GET /api/students/{id}

### Create Student
POST /api/students
Content-Type: application/json
{
"studentName": "John Doe",
"email": "john@example.com",
"enrollmentDate": "2024-04-23",
"gpa": "8.5/10"
}

### Update Student
PUT /api/students/{id}
Content-Type: application/json
{
"studentName": "Updated Name",
"email": "updated@example.com",
"enrollmentDate": "2024-04-23",
"gpa": "9.0/10"
}

### Delete Student
DELETE /api/students/{id}

## How To Run

1. Clone the repository
2. Update `application.properties` with your MySQL credentials
3. Run: `mvn spring-boot:run`
4. Server starts on `http://localhost:8080`

## Testing

Use Postman to test all endpoints.

Sample student data is loaded on startup.

## Author
Abhirama
