package com.javaproject.coding.constructor;



public class ConstructorMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Santosh Kumar");
        Employee emp3 = new Employee(1003,"Rita Singh");

        System.out.println("Employer Name : "+Employee.EMPLOYER_NAME);
        System.out.println("Employee 1 : "+emp1.employeeID+" "+emp1.emplyeeName);
        System.out.println("Employee 2 : "+emp2.employeeID+" "+emp2.emplyeeName);
        System.out.println("Employee 3 : "+emp3.employeeID+" "+emp3.emplyeeName);

        System.out.println("...................");
        Bank cust1 = new Bank();
        Bank cust2 = new Bank("Amber");
        Bank cust3 = new Bank(11255689,"Shiv");

        System.out.println("Banker Name : "+Bank.BANK_NAME);
        System.out.println("Banker IFSC : "+Bank.BANCK_IFSC);
        System.out.println("Bank 1 : "+cust1.accountNo+" "+cust1.customerName);
        System.out.println("Bank 2 : "+cust2.accountNo+" "+cust2.customerName);
        System.out.println("Bank 3 : "+cust3.accountNo+" "+cust3.customerName);
        System.out.println("...................");
        Student student1 = new Student();
        Student student2 = new Student(2);
        Student student3 = new Student(3,"Tulika");

        System.out.println("School Name : "+Student.SCHOOL_NAME);
        System.out.println("Student 1 : "+student1.rollNo+" "+student1.studentName);
        System.out.println("Student 2 : "+student2.rollNo+" "+student2.studentName);
        System.out.println("Student 3 : "+student3.rollNo+" "+student3.studentName);
    }



}
