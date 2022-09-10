package com.javaproject.coding.method;

public class Employee {
    public static String EMPLOYER_NAME = "BBI";

    private int employeeID;
    private String employeeName;

    public Employee(int empID,String name)
    {
        this.employeeID= empID;
        this.employeeName = name;
    }

    public void getEmployeeDetails()
    {
        System.out.println("EmpID : "+employeeID);
        System.out.println("Name : "+employeeName);
    }

    public static void method()
    {
        System.out.println("Static method calling ");
    }

    public static int method(int empId)
    {
        System.out.print("Static method calling ..Employee ID : ");
        return empId;
    }
}
