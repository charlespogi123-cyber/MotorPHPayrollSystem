/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.payroll.finance;

/**
 *
 * @author Charles
 */
public class TaxCalculator {

    // Method to calculate withholding tax based on taxable income
    public static double calculateWithholdingTax(double taxableIncome) {
        if (taxableIncome < 0) {
            throw new IllegalArgumentException("Taxable income cannot be negative.");
        }
        if (taxableIncome <= 20832) {
            return 0; // No withholding tax
        } else if (taxableIncome > 20832 && taxableIncome <= 33333) {
            return (taxableIncome - 20833) * 0.20; // 20% in excess of 20,833
        } else if (taxableIncome > 33333 && taxableIncome <= 66667) {
            return 2500 + (taxableIncome - 33333) * 0.25; // 2,500 + 25% in excess of 33,333
        } else if (taxableIncome > 66667 && taxableIncome <= 166667) {
            return 10833 + (taxableIncome - 66667) * 0.30; // 10,833 + 30% in excess of 66,667
        } else if (taxableIncome > 166667 && taxableIncome <= 666667) {
            return 40833.33 + (taxableIncome - 166667) * 0.32; // 40,833.33 + 32% in excess of 166,667
        } else {
            return 200833.33 + (taxableIncome - 666667) * 0.35; // 200,833.33 + 35% in excess of 666,667
        }
    }

    // Method to calculate taxable income (salary - total deductions)
    public static double calculateTaxableIncome(double salary, double totalDeductions) {
        if (salary < 0 || totalDeductions < 0) {
            throw new IllegalArgumentException("Salary and deductions cannot be negative.");
        }
        return salary - totalDeductions;
    }

    // Method to calculate total deductions (SSS + Philhealth + Pag-ibig)
    public static double calculateTotalDeductions(double sssDeduction, double philhealthDeduction, double pagibigDeduction) {
        if (sssDeduction < 0 || philhealthDeduction < 0 || pagibigDeduction < 0) {
            throw new IllegalArgumentException("Deductions cannot be negative.");
        }
        return sssDeduction + philhealthDeduction + pagibigDeduction;
    }
}
