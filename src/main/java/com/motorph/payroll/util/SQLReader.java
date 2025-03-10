/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.payroll.util;

/**
 *
 * @author Charles
 */
import com.motorph.payroll.employee.Employee;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLReader {
   // Replace with your actual database credentials
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USER = "your_user";
    private static final String PASSWORD = "your_password";

    public List<Employee> readEmployeeData() {
        List<Employee> employees = new ArrayList<>();
        String query = "SELECT * FROM employees"; // Adjust the table name as needed

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Employee employee = new Employee(
                    rs.getString("employee_id"), // Employee #
                    rs.getString("last_name"),   // Last Name
                    rs.getString("first_name"),  // First Name
                    rs.getString("birthday"),    // Birthday
                    rs.getString("address"),     // Address
                    rs.getString("phone_number"),// Phone Number
                    rs.getString("sss_number"),  // SSS #
                    rs.getString("philhealth_number"), // Philhealth #
                    rs.getString("tin_number"),  // TIN #
                    rs.getString("pagibig_number"), // Pag-ibig #
                    rs.getString("status"),      // Status
                    rs.getString("position"),    // Position
                    rs.getString("immediate_supervisor"), // Immediate Supervisor
                    rs.getDouble("basic_salary"), // Basic Salary
                    rs.getDouble("rice_subsidy"), // Rice Subsidy
                    rs.getDouble("phone_allowance"), // Phone Allowance
                    rs.getDouble("clothing_allowance"), // Clothing Allowance
                    rs.getDouble("gross_semi_monthly_rate") // Gross Semi-monthly Rate
                );
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }

    public static void main(String[] args) {
        SQLReader sqlReader = new SQLReader();
        List<Employee> employees = sqlReader.readEmployeeData();
        
        // Example: Print out the employee data
        for (Employee employee : employees) {
            System.out.println(employee); // Assuming Employee has a toString method
        }
    } 
}
