package com.javaproject.coding.collectionProgram.listProgram;

import java.util.Collections;
import java.util.List;

public class SortingList {

    public static List<Vehicle> sortListAscendingOrder(List<Vehicle> vehicleList) {
        Collections.sort(vehicleList,(v1,v2)-> v1.getVehicleName().compareTo(v2.getVehicleName()));
        return vehicleList;
    }

    public static List<Vehicle> sortListDescendingOrder(List<Vehicle> vehicleList) {
        Collections.sort(vehicleList, Collections.reverseOrder());
        return vehicleList;
    }
}
