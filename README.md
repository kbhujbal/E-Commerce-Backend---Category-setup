# E-Commerce-Backend---Category-setup

# E-Commerce Category Backend

This is a **Spring Boot** project that provides the backend services for managing categories in an e-commerce platform. It includes API endpoints for CRUD operations on product categories.

## Features

- Create, Read, Update, and Delete (CRUD) operations for categories.
- RESTful API with JSON responses.
- MySQL/PostgreSQL database integration (configurable).
- Spring Data JPA for database operations.
- Swagger API documentation.
- Exception handling and validation.

## Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Web**
- **Spring Validation**
- **Spring Security (optional)**
- **Database: MySQL/PostgreSQL**
- **Swagger (for API documentation)**

## Installation & Setup

### Prerequisites

- Install **Java 17+**
- Install **Maven**
- Install **MySQL/PostgreSQL** (or configure another database)

### Steps to Run Locally

1. **Clone the Repository**
   ```sh
   git clone https://github.com/your-username/your-repository.git
   cd your-repository
   ```

2. **Configure Database**
   - Update `application.properties` (or `application.yml`) with your database credentials.

3. **Build the Project**
   ```sh
   mvn clean install
   ```

4. **Run the Application**
   ```sh
   mvn spring-boot:run
   ```
   The server will start on `http://localhost:8080`.

## API Endpoints

| Method | Endpoint         | Description                     |
|--------|-----------------|---------------------------------|
| GET    | /api/public/categories | Get all categories             |
| GET    | /api/public/categories/{id} | Get category by ID          |
| POST   | /api/public/categories | Create a new category          |
| PUT    | /api/public/categories/{id} | Update category by ID       |
| DELETE | /api/public/categories/{id} | Delete category by ID       |

## API Documentation

After running the application, you can access API documentation at:
- Swagger UI: `http://localhost:8080/swagger-ui.html`

## Contributing

Feel free to fork the repository and submit pull requests.

## License

This project is licensed under the MIT License.

