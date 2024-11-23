package org.example;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        // Create a new employee
        Employee employee1 = new Employee("Aidana Kokumova", "Manager", 90000.00, new Date());
        Employee employee2 = new Employee("Leyla Rahmatova", "Software Engineer", 85000.00, new Date());
        Employee employee3 = new Employee("Aidar Abylkasymov", "Data Analyst", 75000.00, new Date());


        employeeData.createEmployee(employee1);
        employeeData.createEmployee(employee2);
        employeeData.createEmployee(employee3);
        // Retrieve all employees
        System.out.println("All Employees:");
        List<Employee> employees = employeeData.getAllEmployees();
        employees.forEach(System.out::println);

        // Update an employee's details
        if (!employees.isEmpty()) {
            Employee employeeToUpdate = employees.get(0);
            employeeToUpdate.setSalary(95000.00);
            employeeToUpdate.setPosition("Senior Manager");
            employeeData.updateEmployee(employeeToUpdate);
            System.out.println("\nAfter Update:");
            System.out.println(employeeData.getAllEmployees().get(0));
        }

        // Delete an employee
        if (!employees.isEmpty()) {
            int idToDelete = employees.get(0).getId();
            employeeData.deleteEmployee(idToDelete);
            System.out.println("\nAfter Deletion:");
            employeeData.getAllEmployees().forEach(System.out::println);
        }
    }
}
