package com.javaproject.coding.collectionProgram.listProgram;

import java.util.ArrayList;
import java.util.List;

public class ListProgramMain {
    public static void main(String[] args) {
        OperationOnList operationOnList = new OperationOnList();
       List<Vehicle> vehicleList = new ArrayList<>();
       Vehicle vehicle1 = new Vehicle();
       vehicle1.setVehicleName("TVS");
        Vehicle vehicle2 = new Vehicle();
        vehicle2.setVehicleName("Honda");
        Vehicle vehicle3= new Vehicle();
        vehicle3.setVehicleName("Ford");
        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        vehicleList.add(vehicle3);
//        DifferentWaysOfIteration.iterateWithLambda(vehicleList);
//        DifferentWaysOfIteration.iterateWithIterator(vehicleList);
//        DifferentWaysOfIteration.iterateIndexBased(vehicleList);
//        DifferentWaysOfIteration.iterateWithForEachLoop(vehicleList);
   //     DifferentWaysOfIteration.iterateWithListIterator(vehicleList);
        System.out.println("Index of "+vehicle2+" "+operationOnList.getIndexOfList(vehicleList,vehicle2));
      //  vehicleList = SortingList.sortListAscendingOrder(vehicleList);
      //  DifferentWaysOfIteration.iterateWithLambda(vehicleList);
        vehicleList=SortingList.sortListDescendingOrder(vehicleList);
        DifferentWaysOfIteration.iterateWithLambda(vehicleList);

    }
}
