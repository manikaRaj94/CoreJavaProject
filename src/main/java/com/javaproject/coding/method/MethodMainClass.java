package com.javaproject.coding.method;

public class MethodMainClass {


    public static void main(String[] args) {
       Employee.method();
        System.out.println(Employee.method(1001));

        Employee emp = new Employee(1002,"Manika");
        emp.getEmployeeDetails();
    }
}
