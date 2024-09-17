# LiveHelp - Web Application

### Developed by:
- **Marin Radu-George** - Student, Faculty of Mathematics and Computer Science, University of Ovidius
- **Repciuc Valentin** - Student, Faculty of Mathematics and Computer Science, University of Ovidius
- **Petrică Laurențiu** - Student, Faculty of Mathematics and Computer Science, University of Ovidius

---

## Table of Contents
1. [Introduction](#introduction)
2. [Technologies Used](#technologies-used)
3. [Installation and Setup](#installation-and-setup)
4. [Web Application Overview](#web-application-overview)
5. [Features](#features)
6. [Administrator Functionalities](#administrator-functionalities)
7. [Demo](#demo)
8. [Conclusion](#conclusion)

---

## Introduction

**LiveHelp** is a help desk support application that allows users to submit tickets to different departments within a company (e.g., Logistics), and representatives from those departments can resolve them. The app facilitates smooth communication between users and employees, streamlining the support process.

---

## Technologies Used

The development of this project involved both front-end and back-end technologies, including:

- **HTML & CSS** – For structuring and styling web pages.
- **JavaScript & jQuery** – For client-side scripting and interactivity.
- **Bootstrap 5.3.3** – For responsive design and UI components.
- **MyBatis** – For database interaction using the DAO pattern.
- **MySQL** – Relational database used for storing data.
- **Apache Tomcat 8.5** – Web server for running the application.
- **Spring Framework** – MVC pattern implementation for the back-end.

---

## Installation and Setup

Follow these steps to set up the project on your local machine:

1. **Download and Install Eclipse**  
   [Eclipse IDE for Enterprise Java and Web Developers](https://www.eclipse.org/downloads/packages/)
   
   After downloading, extract and run the Eclipse executable to open the IDE.

2. **Install MySQL**  
   Download MySQL from [MySQL official website](https://www.mysql.com/), install it and set up your local database.

3. **Install Java**  
   Ensure you have JDK installed. You can download the latest version from [Oracle Java](https://www.oracle.com/java/technologies/javase-downloads.html).

4. **Install Apache Tomcat 8.5**  
   Download Apache Tomcat from [Apache.org](https://tomcat.apache.org/download-80.cgi) and configure it to work with Eclipse.

5. **Clone the Repository**  
   Clone this repository using Git:
   ```bash
   git clone https://github.com/username/LiveHelp.git
Set Up the Database
Create a MySQL database and import the necessary tables:
sql
CREATE DATABASE livehelp_db;
-- Add other SQL commands to create tables based on the project structure.
Web Application Overview
The application is structured using the MVC pattern, and the database follows a relational structure with 7 tables:

users, roles, tickets, history, categories, notifications, and ratings.

Front-End

Implemented 11 HTML pages for user interaction, including:

Sign In, Sign Up, Dashboard, Your Tickets, Tickets to Solve, History, Users, Profile, About Us, Settings, Terms and Conditions.

Back-End

Developed using Spring MVC with controllers, services, and DAOs.

MyBatis is used for mapping database operations to Java objects and XML-based SQL queries.

Features:

1. Ticket Creation
Users can create tickets by selecting the department to which they want to send a ticket (e.g., Logistics). Only departments other than their own can be selected.

2. Ticket Management
Users can view tickets they have submitted and their statuses.
Users can respond to tickets assigned to their department.

4. Notifications
Notifications are displayed to users when new tickets are created or resolved.

5. Profile Management
Users can update their personal information, such as name, email, and phone number, via the Profile page.

Administrator Functionalities

Administrators have extended capabilities, including:

1. Viewing All Tickets
Administrators can view and manage all tickets from all departments.

2. Assigning Roles
New users are initially assigned a "No Role" role, and administrators can modify their roles to allow them to solve tickets.

Demo:
You can watch a demo of the application by following this link: https://www.youtube.com/watch?v=Ntw51lPifLI&ab_channel=ValentinRepciuc

Conclusion
The LiveHelp application was a collaborative effort aimed at improving the support and ticketing process within organizations. It efficiently manages user requests and responses while providing a user-friendly interface. This project showcases modern web development practices and uses robust frameworks to ensure scalability and maintainability.

Contact
For more details about this project or further inquiries, feel free to contact us via the About Us page.
