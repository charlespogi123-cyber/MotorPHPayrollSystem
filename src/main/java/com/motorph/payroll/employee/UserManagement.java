/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.payroll.employee;

/**
 *
 * @author Charles
 */

public class UserManagement {
    private String username;
    private String role;

    // Constructor
    public UserManagement(String username, String role) {
        this.username = username;
        this.role = role;
    }

    // Display permissions
    public void displayPermissions() {
        System.out.println("User: " + username);
        System.out.println("Role: " + role);
    }

    // Update user role
    public void updateRole(String newRole) {
        this.role = newRole;
        System.out.println("Role updated to: " + newRole);
    }
}