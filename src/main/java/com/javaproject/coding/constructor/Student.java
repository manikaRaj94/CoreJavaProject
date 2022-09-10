package com.javaproject.coding.constructor;

public class Student {
    public static String SCHOOL_NAME = "DAV Public School";

    public int rollNo;
    public String studentName;

    public Student()
    {
        this.rollNo = 1;
        this.studentName ="Manika";
    }

    public Student(int rollNo, String studentName) {
        this.rollNo = rollNo;
        this.studentName = studentName;
    }

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }
}
