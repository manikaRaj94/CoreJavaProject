package com.javaproject.coding.collectionProgram.listProgram;

import java.util.ArrayList;
import java.util.List;

public class OperationOnList {

    public List<Vehicle> addListForVehicle(Vehicle vehicle){
        List<Vehicle> vehicles = new ArrayList<>();

        return vehicles;

    }

    public int getIndexOfList( List<Vehicle> vehicleList,Vehicle vehicle)
    {
        return  vehicleList.lastIndexOf(vehicle);
    }
}
