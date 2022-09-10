package com.javaproject.coding.collectionProgram.comparableComparatorInterface;

import java.util.Collections;
import java.util.List;

public class StudentMainClass {
    public static void main(String[] args) {

        List<Student> studentList =  StudentOperation.addStudent();
        System.out.println("Before comparing : ");
        StudentOperation.getStudents(studentList);
        Collections.sort(studentList);
        System.out.println("After comparing : ");
        StudentOperation.getStudents(studentList);

    }
}
