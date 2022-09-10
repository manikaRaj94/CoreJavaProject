package com.javaproject.coding.arrayProgram;

public class OneDimensionalArray {

    public void declareThenInitialize() {
        int[] array1 = new int[3];
        array1[0] = 11;
        array1[1] = 22;
        array1[2] = 33;
        for (int i = 0;i< array1.length;i++)
        {
            System.out.print(array1[i]+",");
        }
        System.out.println();
    }

    public void declareWithInitialization() {
        int[] array1 = {44, 55, 66, 77};
        for (int i = 0;i< array1.length;i++)
        {
            System.out.print(array1[i]+",");
        }
        System.out.println();

    }

}
