# Student Management Information System (SMIS) Mobile App

## Project Overview
The SMIS mobile app is an Android application developed in **Kotlin**. It allows for efficient management of student information by using a **Room Database** for local storage and a **Laravel backend** for fetching student performance data.

**Key Features:**  
- User Authentication (Login)  
- Student Registration  
- Viewing Registered Students  
- Generating Performance Reports  
- RecyclerView for displaying data  
- Networking with Retrofit & LiveData  

---

## Screenshots
*(Save your screenshots in a `screenshots/` folder in the repo)*

### Login Screen
The login screen allows users to enter a valid email and password to access the app. It validates credentials and shows appropriate toast messages.  
![Login Screen](https://github.com/evans-njau/student-management-system/blob/master/login%20page.jpg)

### Register Student Screen
This screen lets the user add a new student with fields like Name, Registration Number, and Course. Data is stored locally in Room.  
![Register Student Screen](https://github.com/evans-njau/student-management-system/blob/master/add%20student.jpg)

### View Students Screen
Displays all students stored in the Room database. Uses RecyclerView for dynamic list updates.  
![View Students Screen](https://github.com/evans-njau/student-management-system/blob/master/stuident%20list.jpg)

### Dashboard / Navigation
Main dashboard providing quick navigation to key features: Register Student, View Students, and Generate Report.  
![Dashboard Screen](https://github.com/evans-njau/student-management-system/blob/master/navigation.jpg)

### Generate Report Screen
Shows student performance fetched from the Laravel backend. Displays marks for Mathematics, English, Computer, and the calculated Average.  

---

## Features Description
- **Authentication** – Validates login credentials and shows toast messages.  
- **Room Database** – Local storage for students with CRUD operations.  
- **RecyclerView** – Displays student lists dynamically and supports live updates.  
- **Networking & LiveData** – Fetches data from backend and updates UI automatically.  
- **Navigation** – Dashboard buttons to quickly access all main activities.  

---

## Setup Instructions

### Backend (Laravel)
1. Clone the Laravel backend repository.  
2. Configure `.env` with your database credentials.  
3. Run migrations and seeders:
```bash
php artisan migrate:fresh --seed
