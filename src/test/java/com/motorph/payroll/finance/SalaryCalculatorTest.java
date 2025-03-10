/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.payroll.finance;

/**
 *
 * @author Charles
 */
import com.motorph.payroll.employee.HourlyEmployee;
import com.motorph.payroll.employee.SalariedEmployee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryCalculatorTest {

    @Test
    public void testHourlyEmployeeSalary() {
        HourlyEmployee hourlyEmployee = new HourlyEmployee(
            "EMP002", "Doe", "Jane", "1995-05-15", "456 Elm St", "987-654-3210",
            "987-65-4321", "987654321098", "987-654-321", "9876-5432-1098", "Active",
            "Developer", "John Doe", 0, 0, 0, 0, 0, 25, 160
        );

        // Test basic pay calculation
        assertEquals(4000, hourlyEmployee.calculateBasicPay(), 0.001);

        // Test deductions calculation
        assertEquals(400, hourlyEmployee.calculateDeductions(), 0.001);
    }

    @Test
    public void testSalariedEmployeeSalary() {
        SalariedEmployee salariedEmployee = new SalariedEmployee(
            "EMP001", "Doe", "John", "1990-01-01", "123 Main St", "123-456-7890",
            "123-45-6789", "123456789012", "123-456-789", "1234-5678-9012", "Active",
            "Manager", "Jane Smith", 50000, 1500, 1000, 500, 52000, 50000
        );

        // Test basic pay calculation
        assertEquals(50000, salariedEmployee.calculateBasicPay(), 0.001);

        // Test deductions calculation
        assertEquals(7500, salariedEmployee.calculateDeductions(), 0.001);
    }
}