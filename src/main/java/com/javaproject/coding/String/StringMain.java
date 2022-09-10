package com.javaproject.coding.String;

import java.util.HashMap;

public class StringMain {
    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass(12,"eMexo");
        System.out.println(immutableClass.getId()+" "+immutableClass.getName());
        immutableClass = new ImmutableClass(24,"Aishwarya");
        System.out.println(immutableClass.getId()+" "+immutableClass.getName());

//        StringCompare stringCompare = new StringCompare();
//        System.out.println(stringCompare.compareStringUsingCompareTo("Manika", "manika"));
//        System.out.println(stringCompare.compareStringUsingEquals("Manika","manika"));
//        System.out.println(stringCompare.compareStringUsingEqualIgnoreCase("Manika","manika"));
//        System.out.println(stringCompare.compareStringUsingDoubleEquals("Manika","manika"));
    }
}
