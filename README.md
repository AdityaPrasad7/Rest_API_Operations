# REST API Operations Project

## Project Overview
This is a Spring Boot-based REST API project that implements a Cloud Vendor Management System. The project is built using:
- Java 17
- Spring Boot 3.5.0
- Maven for dependency management

## Project Structure
The project follows a standard Spring Boot application structure:
```
REST_API_Operation/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── demo/
│   │   │               ├── controller/
│   │   │               │   └── CloudVendorApiService.java
│   │   │               └── model/
│   │   │                   └── CloudVendor.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
└── pom.xml
```

## Key Components

### 1. Model Layer (`CloudVendor.java`)
- Represents the data model for cloud vendors
- Contains the following attributes:
  - `vendorId`: Unique identifier for the vendor
  - `vendorName`: Name of the cloud vendor
  - `vendorAddress`: Physical address of the vendor
  - `vendorPhoneNumber`: Contact number of the vendor
- Includes standard getters and setters
- Has both default and parameterized constructors

### 2. Controller Layer (`CloudVendorApiService.java`)
Implements a RESTful API with the following endpoints:

- Base URL: `/cloudvendor`

#### Available Endpoints:
1. **GET** `/{vendorId}`
   - Retrieves cloud vendor details by ID
   - Currently returns a single vendor object

2. **POST** `/`
   - Creates a new cloud vendor
   - Accepts vendor details in request body
   - Returns success message

3. **PUT** `/`
   - Updates existing cloud vendor details
   - Accepts updated vendor details in request body
   - Returns success message

4. **DELETE** `/{vendorId}`
   - Deletes a cloud vendor by ID
   - Returns success message

### 3. Dependencies
The project uses several Spring Boot dependencies:
- `spring-boot-starter-web`: For building web applications
- `spring-boot-devtools`: For development convenience
- `spring-boot-starter-test`: For testing capabilities

## Current Implementation Status
The current implementation is a basic version with:
- In-memory storage (using a single `CloudVendor` object)
- Basic CRUD operations
- No database integration yet
- No service layer implementation
- No error handling
- No validation

## Areas for Improvement
1. **Data Persistence**
   - Add database integration (e.g., MySQL, PostgreSQL)
   - Implement proper data storage and retrieval

2. **Service Layer**
   - Add a service layer for business logic
   - Implement proper separation of concerns

3. **Error Handling**
   - Add proper exception handling
   - Implement custom error responses

4. **Validation**
   - Add input validation
   - Implement proper request/response validation

5. **Security**
   - Add authentication and authorization
   - Implement security best practices

6. **Documentation**
   - Add API documentation (e.g., Swagger/OpenAPI)
   - Include proper code comments

7. **Testing**
   - Add unit tests
   - Implement integration tests

## How to Use
1. The application can be run using Maven:
   ```bash
   mvn spring-boot:run
   ```

2. API endpoints can be accessed at:
   - Base URL: `http://localhost:8080/cloudvendor`

3. Example API calls:
   - Create vendor: POST `/cloudvendor`
   - Get vendor: GET `/cloudvendor/{vendorId}`
   - Update vendor: PUT `/cloudvendor`
   - Delete vendor: DELETE `/cloudvendor/{vendorId}`

This project provides a foundation for a cloud vendor management system and can be extended with additional features and improvements as needed.
