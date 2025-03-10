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
import com.motorph.payroll.employee.LeaveManagement;

public class HRDept {
    private LeaveManagement leaveManagement;

    public HRDept() {
        this.leaveManagement = new LeaveManagement();
    }

    // Method to manage employee records
    public void manageEmployeeRecords(Employee employee) {
        System.out.println("Managing records for " + employee.getFirstName() + " " + employee.getLastName());
    }

    // Method to approve leave requests
    public void approveLeaveRequest(Employee employee, int leaveDays) {
        leaveManagement.approveLeave(employee, leaveDays);
    }

    // Method to manage employee benefits
    public void manageEmployeeBenefits(Employee employee) {
        System.out.println("Managing benefits for " + employee.getFirstName() + " " + employee.getLastName());
    }
}
