/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.payroll.employee;

/**
 *
 * @author Charles
 */

public class LeaveRequest {
    private final Employee employee;
    private final int leaveDaysRequested;

    // Constructor
    public LeaveRequest(Employee employee, int leaveDaysRequested) {
        this.employee = employee;
        this.leaveDaysRequested = leaveDaysRequested;
    }

    // Process leave request
    public void processLeaveRequest() {
        System.out.println("Processing leave request for " + employee.getFirstName() + " " + employee.getLastName());
    }
}