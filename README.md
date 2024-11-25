# Employee Database Management System

## Project Overview
This Employee Database Management System is built using Java with JDBC to interact with a PostgreSQL database. The system allows you to perform CRUD (Create, Read, Update, Delete) operations on employee records. The application handles employee data such as name, position, salary, and hire date. The goal is to provide a simple but effective way to manage employees in a database through a Java-based interface.

### Components of the Project

#### Employee Class:

This class represents an employee entity. It contains attributes like id, name, position, salary, and hireDate, which are essential details for each employee. The class also provides constructors for creating new employee objects and methods for accessing and modifying employee data (getters and setters). Additionally, it includes a toString() method for displaying employee information in a human-readable format.

#### EmployeeData Class:

#### This class is responsible for interacting with the PostgreSQL database. It provides methods to:

Establish a connection to the database using JDBC.

Create new employee records.

Retrieve all employee records from the database.

Update existing employee records.

Delete employee records by ID.

It uses SQL queries to perform these operations. Each method is designed to handle one specific action related to employee data.

#### Main Class:
The Main class serves as the entry point for testing the functionalities. It demonstrates how to create new employees, retrieve all employees, update employee details, and delete an employee. It calls the methods from the EmployeeData class to perform these operations and prints the results to the console.

### Key Operations

#### Creating Employees:
You can add new employees to the database. This is done by creating Employee objects and passing them to the createEmployee() method in the EmployeeData class. The Employee object includes essential data like name, position, salary, and hire date.

#### Retrieving All Employees:
Once employees are created, you can retrieve and display all employee records stored in the database. The getAllEmployees() method queries the database and returns a list of Employee objects, which is then displayed in the console.

#### Updating Employee Details:
Employees' details can be updated using the updateEmployee() method. For instance, you can modify an employee’s position or salary and then commit the changes to the database.

#### Deleting an Employee:
If an employee needs to be removed from the database, you can use the deleteEmployee() method by providing the employee’s ID. This method will delete the corresponding employee record from the database.

## Database Structure

The project uses a PostgreSQL database to store employee data. The database has a table named employee, which holds the following columns:

id: A unique identifier for each employee (auto-incremented).

name: The employee's name. 

position: The employee's job title.

salary: The employee’s salary.

hire_date: The date the employee was hired.



##### 1. Create the Database
Use the following SQL commands to create the database and the employee table.


**Step 1: Create the employee_db database**
```sql
CREATE DATABASE employee_db;
```

**Step 2: Create the employee table**
```sql
CREATE TABLE employee (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  position VARCHAR(255) NOT NULL,
  salary DOUBLE PRECISION NOT NULL,
  hire_date DATE NOT NULL
);
```

**2. Insert Sample Data**

Add some test records to the employee table:
```sql
INSERT INTO employee (name, position, salary, hire_date)
VALUES
  ('Aidana Kokumova', 'Manager', 90000.00, '2024-11-24'),
  ('Leyla Rahmatova', 'Software Engineer', 85000.00, '2024-11-24'),
  ('Aidar Abylkasymov', 'Data Analyst', 75000.00, '2024-11-24');
```


**3. Verify the Data**

To check the inserted records:

```sql
SELECT * FROM employee;
```

**4. Java Application Setup**

Your Java application will connect to the employee_db database using the following connection details:

Database: employee_db
Table: employee
Columns: id, name, position, salary, hire_date
Use JDBC in your Java code to interact with the database. The EmployeeData class will handle CRUD operations on the employee table.


#### Screenshots

**1. Database Before Running the Program**

<img width="834" alt="Снимок экрана 2024-11-24 в 02 54 24" src="https://github.com/user-attachments/assets/bf19b915-bb0b-4934-bf32-cc7e4f20c9c3">


**2. After Inserting Employees**

<img width="830" alt="Снимок экрана 2024-11-24 в 02 54 56" src="https://github.com/user-attachments/assets/3d7d0320-0e61-45d6-91db-245e04044676">

**3. After Updating an Employee**

<img width="829" alt="Снимок экрана 2024-11-24 в 02 58 20" src="https://github.com/user-attachments/assets/45b62614-7f98-480a-ba93-428a187168bf">

**4. After Deleting an Employee**

<img width="813" alt="Снимок экрана 2024-11-24 в 03 05 49" src="https://github.com/user-attachments/assets/7e3e1fb6-d8e0-4b22-9028-f7f51f65b149">

