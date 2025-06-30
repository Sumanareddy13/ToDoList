# ✅ ToDoList – Spring Boot Application

A simple task management system built using **Spring Boot 3.4.2**, designed to help users create, read, update, and delete tasks. This project demonstrates clean architecture, RESTful APIs, data validation, and database persistence using JPA with MySQL.

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot 3.4.2**
  - Spring Web
  - Spring Data JPA
  - Spring Validation
- **MySQL**
- **Lombok**
- **Maven**
- **JUnit + Spring Test**

---

## 📦 Project Structure

ToDoList/
├── src/
│ ├── main/
│ │ ├── java/com/yourpackage/...
│ │ └── resources/
│ │ ├── application.properties
│ │ └── static/templates (if using frontend)
│ └── test/
│ └── java/com/yourpackage/...
├── pom.xml
└── README.md
---

## ⚙️ Prerequisites

- Java 17+
- Maven 3.6+
- MySQL running locally or in Docker

---

## ⚙️ Configuration

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todolist_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

## Run via Maven:
```./mvnw spring-boot:run

