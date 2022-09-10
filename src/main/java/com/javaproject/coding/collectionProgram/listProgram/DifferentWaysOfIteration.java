package com.javaproject.coding.collectionProgram.listProgram;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DifferentWaysOfIteration {

    public static void iterateWithForEachLoop( List<Vehicle> vehicleList )
    {
        for(Vehicle v : vehicleList)
        {
            System.out.println(v.getVehicleName());
        }
    }

    public static void iterateIndexBased( List<Vehicle> vehicleList )
    {
        for(int i =0;i<vehicleList.size();i++)
        {
            System.out.println(vehicleList.get(i));
        }
    }

    public static void iterateWithIterator( List<Vehicle> vehicleList )
    {
        Iterator<Vehicle> iterator = vehicleList.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next().getVehicleName());
        }
    }

    public static void iterateWithListIterator( List<Vehicle> vehicleList )
    {
        ListIterator<Vehicle> listIterator = vehicleList.listIterator();
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next().getVehicleName());
        }
        while(listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous().getVehicleName());
        }

    }

    public static void iterateWithLambda( List<Vehicle> vehicleList )
    {
        vehicleList.forEach(v-> System.out.println(v.getVehicleName()));
    }
}
