package com.javaproject.coding.interviewPractice.abstractInterface;

public class MainClass {
    public static void main(String[] args) {
        Vehicle vehicleInterface= new SubClassExample();
        System.out.println(vehicleInterface.getVehicle());
        vehicleInterface.abstractMethod();

        Engine engineAbstract = new SubClassExample();
        engineAbstract.abstractEngineMethod();
        engineAbstract.engineDefaultMethod();
        System.out.println(Engine.engine);
        Engine.engineStaticMethod();

        SubClassExample subClassExample = new SubClassExample();
        subClassExample.abstractEngineMethod();
        subClassExample.abstractMethod();
        subClassExample.abstractMethod();
        subClassExample.engineDefaultMethod();
        System.out.println(SubClassExample.getVehicleStatic());
        System.out.println(SubClassExample.engine);
        System.out.println(subClassExample.getVehicle());
        SubClassExample.staticMethod();
    }
}
