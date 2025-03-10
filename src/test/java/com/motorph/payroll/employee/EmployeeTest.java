/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.payroll.employee;

/**
 *
 * @author Charles
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void testEmployeeConstructor() {
        Employee employee = new Employee(
            "EMP001", "Doe", "John", "1990-01-01", "123 Main St", "123-456-7890",
            "123-45-6789", "123456789012", "123-456-789", "1234-5678-9012", "Active",
            "Manager", "Jane Smith", 50000, 1500, 1000, 500, 52000
        );

        // Test constructor values
        assertEquals("EMP001", employee.getEmployeeNumber());
        assertEquals("John", employee.getFirstName());
        assertEquals("Doe", employee.getLastName());
        assertEquals("Manager", employee.getPosition());
        assertEquals(50000, employee.getBasicSalary(), 0.001);
    }

    @Test
    public void testEmployeeSetters() {
        Employee employee = new Employee(
            "EMP001", "Doe", "John", "1990-01-01", "123 Main St", "123-456-7890",
            "123-45-6789", "123456789012", "123-456-789", "1234-5678-9012", "Active",
            "Manager", "Jane Smith", 50000, 1500, 1000, 500, 52000
        );

        // Test setters
        employee.setFirstName("Jane");
        employee.setLastName("Smith");
        employee.setPosition("Senior Manager");

        assertEquals("Jane", employee.getFirstName());
        assertEquals("Smith", employee.getLastName());
        assertEquals("Senior Manager", employee.getPosition());
    }
}

