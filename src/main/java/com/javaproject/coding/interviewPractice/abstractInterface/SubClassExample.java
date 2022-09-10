package com.javaproject.coding.interviewPractice.abstractInterface;

public class SubClassExample extends Vehicle implements Engine{
    @Override
    public void abstractEngineMethod() {
        System.out.println("SubClassExample abstractEngineMethod() override...");
    }

    @Override
    public void engineDefaultMethod() {
        System.out.println("SubClassExample engineDefaultMethod() override...");
        Engine.super.engineDefaultMethod();
    }

    @Override
    public void abstractMethod() {
        System.out.println("SubClassExample Vehicle abstractMethod() override...");

    }
}
