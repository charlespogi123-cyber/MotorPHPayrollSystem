/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.payroll.gui;

/**
 *
 * @author Charles
 */

public class Main {
    public static void main(String[] args) {
        // Launch the EmployeeLoginPage (or the actual login page you want to show) when the app starts
        java.awt.EventQueue.invokeLater(() -> {
            // Replace LoginPage() with EmployeeLoginPage() or whatever your actual login class is
            new EmployeeLoginPage().setVisible(true);
        });
    }
}