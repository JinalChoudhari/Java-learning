# BankEase – Online Banking Management System

BankEase is a web-based banking management application developed using Java and Spring Boot. It provides a simple platform where customers can register, manage their bank accounts, and perform basic banking operations. It also includes an admin dashboard for managing registered bank accounts.

The project was developed as a practical learning application to understand Java web development, Spring Boot, database connectivity, authentication, and role-based access control.

## Features

### Customer Features
- **User Registration & Login:** Customers can create an account and securely log in.
- **Account Management:** Open a bank account and provide personal and nominee details.
- **Account Details:** View account information and current balance.
- **Deposit:** Add money to an account.
- **Withdraw:** Withdraw money while checking the available balance.
- **Fund Transfer:** Transfer money between bank accounts.
- **Transaction History:** View previous deposits, withdrawals, and transfers.
- **Account Status:** View whether an account is active or frozen.

### Admin Features
- **Admin Dashboard:** View registered customers and their bank accounts.
- **View Accounts:** Access account information from the admin panel.
- **Activate Account:** Activate an account when required.
- **Freeze Account:** Temporarily restrict banking transactions on an account.
- **Delete Account:** Permanently delete a bank account and its associated transaction history.

## Technologies Used

| Technology | Purpose |
|---|---|
| Java 17 | Core programming language |
| Spring Boot | Backend application framework |
| Spring MVC | Web request handling |
| Spring Security | Authentication and role-based authorization |
| Spring Data JPA | Database operations |
| Hibernate | ORM and entity management |
| MySQL | Relational database |
| Thymeleaf | Dynamic HTML templates |
| HTML & CSS | Frontend structure and styling |
| Maven | Dependency and project management |


## Project Structure

```text
BankEase/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/bankease/
│   │   │       ├── config/
│   │   │       ├── controller/
│   │   │       ├── entity/
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       └── BankEaseApplication.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.properties
│   │
├── database/
├── pom.xml
├── README.md
└── .gitignore
```

## Getting Started

Follow these steps to run BankEase locally.

### Prerequisites

Make sure you have installed:

- Java JDK 17 or later
- IntelliJ IDEA or another Java IDE
- MySQL Server and MySQL Workbench
- Maven

### 1. Clone the Repository

```bash
git clone https://github.com/JinalChoudhari/BankEase.git
```

Open the project in IntelliJ IDEA.

### 2. Create the Database

Open MySQL Workbench and execute:

```sql
CREATE DATABASE bankease;
```

### 3. Configure Database Connection

Update `src/main/resources/application.properties` with your local MySQL configuration.

Example:

```properties
server.port=8081

spring.datasource.url=jdbc:mysql://localhost:3306/bankease?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

spring.thymeleaf.cache=false
```

Set the `DB_PASSWORD` environment variable to your own MySQL password. Do not put database passwords directly into source code.

### 4. Run the Application

Run `BankEaseApplication.java` from IntelliJ IDEA, or use:

```bash
mvn spring-boot:run
```

### 5. Open the Application

Visit:

```text
http://localhost:8081
```

Register a customer account or log in using an admin account configured by the application.

## Application Access

BankEase supports two main roles:

| Role | Access |
|---|---|
| Customer | Account management, deposits, withdrawals, transfers, and transaction history |
| Admin | Admin dashboard and bank account management |

## Learning Outcomes

Through this project, I practised:

- Developing a Java web application using Spring Boot.
- Implementing MVC architecture.
- Connecting a Spring Boot application to MySQL.
- Creating entities and repositories using Spring Data JPA.
- Implementing authentication and role-based authorization using Spring Security.
- Performing database operations using Hibernate.
- Building customer and admin functionalities.
- Handling banking operations and account status management.

## Future Improvements

- Add automated unit and integration tests.
- Improve validation and error handling.
- Add account statements and downloadable reports.
- Improve security and transaction handling.

