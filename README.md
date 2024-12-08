# User Management System

A full-stack **User Management System** built with **Spring Boot** and **React.js**, featuring role-based access, JWT authentication, and CRUD operations.

---

## Features

- **JWT Authentication**: Secure login and token-based authentication.
- **Role-Based Access**:
  - Admin: Manage all users.
  - User: View profile.
- **User Management**: Admin can add, update, and delete users.
- **Dynamic Routing**: Role-based protected routes.

---

## Screenshots

### Login Page (Admin)
![Screenshot 2024-12-08 101245](https://github.com/user-attachments/assets/21c4a0b1-5bad-4c2e-b777-904722656aed)

### Login Page (User)
![Screenshot 2024-12-08 101444](https://github.com/user-attachments/assets/bedba580-b8d4-4690-9d08-5e19b7da557f)

### Profile Page (Admin)
![Screenshot 2024-12-08 101307](https://github.com/user-attachments/assets/36ede80a-a0fe-49b6-a396-81f02d227eae)

### Profile Page (User)
![Screenshot 2024-12-08 101453](https://github.com/user-attachments/assets/1e48cde8-7399-4725-80d1-8285f67361c5)

### User Management Page
![image](https://github.com/user-attachments/assets/9d10de24-aedb-49e6-bec3-babdcf0f47da)

### Update User Page
![Screenshot 2024-12-08 101343](https://github.com/user-attachments/assets/946d4e05-1bcf-4af2-bec6-c717f70fb981)

---

## Prerequisites

- **Java 17+**: Required to run the Spring Boot backend.
- **React.js**: Used to build the frontend interface.
- **MySQL**: Database to store user data securely.
- **Node.js 16+**: Required for managing the React.js frontend development.
- **npm or yarn**: Package managers to install and manage frontend dependencies (e.g., Axios, React Router).

---


## Getting Started

### Backend Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/user-management-system.git
   cd user-management-system/backend
2. Configure the database in application.properties:
  ```bash
  spring.datasource.url=jdbc:mysql://localhost:3306/user_management
  spring.datasource.username=your_db_username
  spring.datasource.password=your_db_password
  ```
3. Run the backend:
  ```bash
  ./mvnw spring-boot:run
  ```

### Frontend Setup

1. Navigate to the frontend directory:
  ```bash
  cd user-management-system/frontend
  ```
2. Install dependencies:
  ```bash
  npm install
  ```
3. Start the application:
  ```bash
  npm start
  ```
---

## API Endpoints

### Auth Endpoints
- **POST** `/auth/register` - Register a new user.
- **POST** `/auth/login` - Log in a user.
- **POST** `/auth/refresh` - Generate a refresh token.

### Admin Endpoints
- **GET** `/admin/get-all-users` - Get a list of all users.
- **GET** `/admin/get-user/{id}` - Get details of a user by ID.
- **PUT** `/admin/update/{id}` - Update user details.
- **DELETE** `/admin/deleteUser/{id}` - Delete a user.

### User Endpoints
- **GET** `/adminuser/get-profile` - Get current user's profile.

---

## File Structure

### Backend
- **Controllers**: Handle requests and map them to services.
- **Services**: Contain business logic.
- **Repositories**: Interface with the database.

### Frontend
- **Components**: Reusable React components.
- **Services**: Axios-based service for API calls.
- **Routing**: Protected routes using `React Router`.

---

## Architecture

### Backend
- Spring Boot application with role-based security.
- JWT Authentication for secure access.
- JPA/Hibernate for database interaction.

### Frontend
- React.js application with dynamic routing.
- Global authentication state using `AuthContext`.

---

## Key Features Explained

### Role-Based Routing
```javascript
{UserService.adminOnly() && (
    <>
        <Route path="/register" element={<RegistrationPage />} />
        <Route path="/admin/user-management" element={<UserManagementPage />} />
        <Route path="update-user/:userId" element={<UpdateUser />} />
    </>
)}
<Route path="*" element={<Navigate to="/login" />} />
```
---

### Authentication Context

`AuthContext.js` provides global authentication state:

- **isAuthenticated**: Tracks login status.
- **isAdmin**: Verifies if the user is an admin.
- **refreshAuthState()**: Updates the state dynamically.

---

## Contribution

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a branch (`feature/your-feature`).
3. Push changes and open a pull request.

---

## Author
Developed by Kalana De Silva. Feel free to reach out for feedback and improvements!








   







