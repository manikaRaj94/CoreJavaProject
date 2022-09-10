package com.javaproject.coding.constructor;

public class Employee {

    public static String EMPLOYER_NAME = "BBI";

    public int employeeID;
    public String emplyeeName;

    public Employee()
    {
        this.employeeID = 1001;
        this.emplyeeName ="Manika Raj";
    }

    public Employee(int employeeID, String emplyeeName) {
        this.employeeID = employeeID;
        this.emplyeeName = emplyeeName;
    }

    public Employee(String emplyeeName) {
        this.emplyeeName = emplyeeName;
    }
}
