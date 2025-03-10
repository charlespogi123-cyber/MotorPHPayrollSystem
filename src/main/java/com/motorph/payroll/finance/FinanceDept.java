/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.payroll.finance;

/**
 *
 * @author Charles
 */

import com.motorph.payroll.employee.Employee;

public class FinanceDept {
    // Method to process payroll for an employee
    public void processPayroll(Employee employee) {
        System.out.println("Processing payroll for " + employee.getFirstName() + " " + employee.getLastName());
        
    }

    // Method to generate payroll reports
    public void generatePayrollReport() {
        System.out.println("Generating payroll report...");
        
    }

    // Method to calculate taxes for an employee
    public double calculateTaxes(Employee employee, double taxableIncome) {
        return TaxCalculator.calculateWithholdingTax(taxableIncome);
    }
}