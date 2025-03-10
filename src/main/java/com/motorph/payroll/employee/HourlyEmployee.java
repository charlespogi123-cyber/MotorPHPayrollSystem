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

public class HourlyEmployee extends Employee implements SalaryCalculator {
    private final double hourlyRate;
    private final double hoursWorked;

    public HourlyEmployee(String employeeNumber, String lastName, String firstName, String birthday, String address,
                          String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber,
                          String pagibigNumber, String status, String position, String immediateSupervisor,
                          double basicSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance,
                          double grossSemiMonthlyRate, double hourlyRate, double hoursWorked) {
        super(employeeNumber, lastName, firstName, birthday, address, phoneNumber, sssNumber, philhealthNumber,
              tinNumber, pagibigNumber, status, position, immediateSupervisor, basicSalary, riceSubsidy,
              phoneAllowance, clothingAllowance, grossSemiMonthlyRate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateBasicPay() {
        return hourlyRate * hoursWorked; // Hourly pay calculation
    }

    @Override
    public double calculateDeductions() {
        return calculateBasicPay() * 0.10; // Example: 10% deduction
    }

    @Override
    public double calculateNetPay() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}