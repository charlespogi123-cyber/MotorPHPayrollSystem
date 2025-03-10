/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.payroll.finance;

/**
 *
 * @author Charles
 */
public interface SalaryCalculator {
    double calculateBasicPay();
    double calculateDeductions();
    double calculateNetPay();
}

