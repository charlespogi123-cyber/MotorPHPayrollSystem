/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.payroll.employee;

/**
 *
 * @author Charles
 */

import com.motorph.payroll.finance.SalaryCalculator;

public class SalariedEmployee extends Employee implements SalaryCalculator {
    private final double monthlySalary;

    public SalariedEmployee(String employeeNumber, String lastName, String firstName, String birthday, String address,
                            String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber,
                            String pagibigNumber, String status, String position, String immediateSupervisor,
                            double basicSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance,
                            double grossSemiMonthlyRate, double monthlySalary) {
        super(employeeNumber, lastName, firstName, birthday, address, phoneNumber, sssNumber, philhealthNumber,
              tinNumber, pagibigNumber, status, position, immediateSupervisor, basicSalary, riceSubsidy,
              phoneAllowance, clothingAllowance, grossSemiMonthlyRate);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateBasicPay() {
        return monthlySalary; // Fixed monthly salary
    }

    @Override
    public double calculateDeductions() {
        return monthlySalary * 0.15; // Example: 15% deduction
    }

    @Override
    public double calculateNetPay() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}