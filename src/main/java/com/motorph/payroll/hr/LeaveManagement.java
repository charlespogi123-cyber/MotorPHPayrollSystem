/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.payroll.hr;

/**
 *
 * @author Charles
 */
import com.motorph.payroll.employee.Employee;

public class LeaveManagement {
    // Method to apply for leave
    public void applyForLeave(Employee employee, int leaveDays) {
        if (employee.getLeaveBalance() >= leaveDays) {
            employee.setLeaveBalance(employee.getLeaveBalance() - leaveDays);
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " applied for " + leaveDays + " days of leave.");
        } else {
            System.out.println("Insufficient leave balance for " + employee.getFirstName() + " " + employee.getLastName());
        }
    }

    // Method to approve leave
    public void approveLeave(Employee employee, int leaveDays) {
        System.out.println("Leave approved for " + employee.getFirstName() + " " + employee.getLastName() + " for " + leaveDays + " days.");
    }

    // Method to check leave balance
    public void checkLeaveBalance(Employee employee) {
        System.out.println("Leave balance for " + employee.getFirstName() + " " + employee.getLastName() + ": " + employee.getLeaveBalance() + " days.");
    }
}
