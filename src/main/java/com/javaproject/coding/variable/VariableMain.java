package com.javaproject.coding.variable;

public class VariableMain {
    public static void main(String[] args) {

        System.out.println("School  : "+Student.SCHOOL_NAME);
      //  Student student1 = new Student(1,"Manika Raj");
        Student student1 = new Student();
        System.out.println("Roll No  : "+student1.rollNo);
        System.out.println("Name : "+student1.studentName);

        int i =5;
        String name = "Raj";
        System.out.println("Local Variable : "+i+" "+name);

    }
}
