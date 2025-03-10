/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.payroll.employee;

/**
 *
 * @author Charles
 */

public class Manager {
    private String firstName;
    private String lastName;
    private String address;
    private String employeeID;
    private double salary;
    private int leaveBalance;

    // Constructor for Manager (No super(), so initializing fields directly)
    public Manager(String firstName, String lastName, String address, String employeeID, double salary, int leaveBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.employeeID = employeeID;
        this.salary = salary;
        this.leaveBalance = leaveBalance;
    }

    // Getters and Setters (You can add getters and setters for the properties as needed)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getLeaveBalance() {
        return leaveBalance;
    }

    public void setLeaveBalance(int leaveBalance) {
        this.leaveBalance = leaveBalance;
    }

    // Manager approves leave for employee
    public void approveLeave(Manager employee, int days) {
        if (employee.getLeaveBalance() >= days) {
            employee.setLeaveBalance(employee.getLeaveBalance() - days);
            System.out.println("Manager approves " + days + " days of leave for " + employee.getFirstName() + " " + employee.getLastName());
        } else {
            System.out.println("Insufficient leave balance for " + employee.getFirstName() + " " + employee.getLastName());
        }
    }

    // Manager increases leave balance for employee
    public void increaseLeaveBalance(Manager employee, int days) {
        employee.setLeaveBalance(employee.getLeaveBalance() + days);
        System.out.println("Manager increases " + employee.getFirstName() + " " + employee.getLastName() + "'s leave balance by " + days + " days.");
    }

    // Manager reviews and adjusts employee salary
    public void reviewSalary(Manager employee, double adjustment) {
        double newSalary = employee.getSalary() + adjustment;
        employee.setSalary(newSalary);
        System.out.println("Manager reviews salary for " + employee.getFirstName() + " " + employee.getLastName() + ". New salary: " + newSalary);
    }
}
