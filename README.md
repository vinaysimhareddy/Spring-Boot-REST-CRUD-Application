🎫 Spring Boot REST CRUD Application
Ticket Booking System
📌 Overview

This project is a RESTful API built using Spring Boot for managing a ticket booking system. It provides full CRUD functionality to handle ticket records stored in a MySQL database.

The application follows a layered architecture:
➡️ Controller → Service → Repository → Database

⚙️ Tech Stack
☕ Java (8 / 17 / 21)
🚀 Spring Boot
📦 Maven
🛢️ MySQL
🔗 Spring Data JPA
⚡ Lombok
🧠 Core Functionality
➕ Create Ticket
Accepts ticket details from client
Processes and stores data in database
🔍 Get Ticket by ID
Fetches a specific ticket using unique ID
Returns data or handles missing record
📄 Get All Tickets
Retrieves all ticket records
Returns list of tickets
✏️ Update Ticket Email
Updates only email field of a ticket
Uses partial update logic
❌ Delete Ticket
Removes ticket using ID
Ensures safe deletion
🔄 Application Flow
Client Request
      ↓
Controller Layer
      ↓
Service Layer (Business Logic)
      ↓
Repository Layer (JPA)
      ↓
MySQL Database
      ↓
Response to Client
🗄️ Database Design (Concept)
Single table for ticket records
Unique ticket ID for each entry
Stores passenger and travel details
⚙️ Configuration Overview
🔌 Database configured via properties file
🔄 Hibernate handles ORM
📊 Auto schema update enabled
🧾 SQL logging for debugging
🌐 API Structure

Base URL:

/api/tickets
Method	Purpose
POST	➕ Create
GET	🔍 Read
PUT	✏️ Update
DELETE	❌ Delete
🧪 Testing
Use Postman or any REST client
Typical flow:
➕ Create data
🔍 Retrieve data
✏️ Update data
❌ Delete data
▶️ How to Run
📥 Import project into IDE (IntelliJ / STS)
🛢️ Ensure MySQL is running
🗄️ Create database
⚙️ Update DB credentials
▶️ Run Spring Boot application
🧪 Test APIs using Postman
