package com.javaproject.coding.collectionProgram.comparableComparatorInterface;

import java.util.ArrayList;
import java.util.List;

public class StudentOperation {

    public static List<Student> addStudent()
    {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student();
        student1.setStudentId(1004);
        student1.setStudentName("Manika");
        student1.setStudentAddress("Bangalore");

        Student student2 = new Student();
        student2.setStudentId(1002);
        student2.setStudentName("Ambar");
        student2.setStudentAddress("Jamshedpur");

        Student student3 = new Student();
        student3.setStudentId(1001);
        student3.setStudentName("Shiv");
        student3.setStudentAddress("Shillong");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        return students;


    }

    public static void  getStudents(List<Student> students)
    {
        students.forEach(s -> {
            System.out.print("Student id :"+s.getStudentId());
            System.out.print(" Name :"+s.getStudentName());
            System.out.print(" Address :"+s.getStudentAddress());
            System.out.println();
        });
    }
}
