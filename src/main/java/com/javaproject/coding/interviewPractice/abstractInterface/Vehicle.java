package com.javaproject.coding.interviewPractice.abstractInterface;

public abstract  class Vehicle {

    private String vehicle="Vehicle";
    private static String vehicleStatic = "VehicleStatic";
    public static void staticMethod()
    {
        System.out.println("Vehicle staticMethod");
    }

    public abstract  void abstractMethod();

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public static String getVehicleStatic() {
        return vehicleStatic;
    }

    public static void setVehicleStatic(String vehicleStatic) {
        Vehicle.vehicleStatic = vehicleStatic;
    }
}
