
# Bank-Management-System

The Bank Management System is a Java-based application designed to manage both bank employees and customers. It connects to a MySQL database and provides a login module for customers while offering common functionalities such as adding, deleting, and viewing records for both employees and customers. The system is built to manage the operations of a bank efficiently and securely.




## Features:
- Login Module for Customers: Allows bank customers to log in and access their personal details and account information securely.
- Employee Management: Enables bank administrators to add, delete, and view employee records, including employee ID, name, age, gender, phone number, and address.
- Customer Management: Facilitates the addition, deletion, and viewing of customer details like customer ID, name, age, contact information, and account details.
- Database-Driven Operations: All data for employees and customers is stored in a MySQL database, providing persistent storage and secure access.
- Formatted Console Output: Displays employee and customer details in a structured and readable format.

## Project Structure:
- ConnectionProvider: Handles the connection to the MySQL database using JDBC.
- EmployeeModule: Allows bank administrators to manage employee data, including adding, deleting, and viewing employee records.
- CustomerModule: Manages customer-related operations such as login, adding, deleting, and viewing customer details.
- LoginModule: Authenticates customers by verifying their credentials before allowing them access to their personal banking information.

## Technologies Used:
- Java: Core programming language used for business logic and data handling.
- MySQL: Backend database for storing employee and customer records.
- JDBC: Java Database Connectivity is used to connect to and interact with the MySQL database.


