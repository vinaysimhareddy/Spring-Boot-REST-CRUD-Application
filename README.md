# 🎫 Spring Boot REST CRUD Application
## 📌 Ticket Booking System

---

## 📖 Overview
This project is a RESTful API built using Spring Boot for managing a ticket booking system. It supports full CRUD (Create, Read, Update, Delete) operations and stores data in a MySQL database.

The application follows a layered architecture:  
➡️ Controller → Service → Repository → Database

---

## ⚙️ Tech Stack
- ☕ Java (8 / 17 / 21)
- 🚀 Spring Boot
- 📦 Maven
- 🛢️ MySQL
- 🔗 Spring Data JPA
- ⚡ Lombok

---

## 🧠 Core Functionality

### ➕ Create Ticket
- Accepts ticket details from client  
- Stores data in database  

### 🔍 Get Ticket by ID
- Fetches ticket using ID  
- Returns data or error if not found  

### 📄 Get All Tickets
- Retrieves all ticket records  

### ✏️ Update Ticket Email
- Updates only the email field of a ticket  

### ❌ Delete Ticket
- Deletes ticket using ID  

---

## 🔄 Application Flow

```
Client Request
      ↓
Controller Layer
      ↓
Service Layer
      ↓
Repository Layer
      ↓
MySQL Database
      ↓
Response to Client
```

---

## 🗄️ Database Design
- 📌 Single table for tickets  
- 🔑 Each ticket has a unique ID  
- 🧾 Stores passenger and travel details  

---

## ⚙️ Configuration
- 🔌 Database configured in application.properties  
- 🔄 Hibernate used for ORM  
- 📊 Auto table update enabled  
- 🧾 SQL logging enabled  

---

## 🌐 API Structure

**Base URL:**  
`/api/tickets`

| Method  | Description        |
|--------|--------------------|
| POST   | ➕ Create ticket   |
| GET    | 🔍 Get ticket(s)  |
| PUT    | ✏️ Update ticket  |
| DELETE | ❌ Delete ticket  |

---

## 🧪 Testing
Use Postman or any REST client.

**Steps:**
1. ➕ Create ticket  
2. 🔍 Retrieve ticket  
3. ✏️ Update ticket  
4. ❌ Delete ticket  

---

## ▶️ How to Run

1. 📥 Import project into IDE (IntelliJ / STS)  
2. 🛢️ Ensure MySQL is running  
3. 🗄️ Create the required database  
4. ⚙️ Update database credentials in application.properties  
5. ▶️ Run the Spring Boot application  
6. 🧪 Test APIs using Postman  

---
