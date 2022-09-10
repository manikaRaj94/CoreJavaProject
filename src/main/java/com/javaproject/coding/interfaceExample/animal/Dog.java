package com.javaproject.coding.interfaceExample.animal;

public class Dog implements Animal {
    @Override
    public void move() {
        System.out.println("Dog is walking...");
    }
}
