/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.payroll.it;

/**
 *
 * @author Charles
 */

import com.motorph.payroll.employee.Employee;

public class ITDept {
    public void manageUserRoles(Employee employee, String newRole) {
        employee.setPosition(newRole); // Use setPosition instead of setRole
        System.out.println("User role updated for " + employee.getFirstName() + " " + employee.getLastName() + " to " + newRole);
    }
}