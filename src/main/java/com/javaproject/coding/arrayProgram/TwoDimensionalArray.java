package com.javaproject.coding.arrayProgram;

public class TwoDimensionalArray {
    public void declareThenInitialize() {
        int[][] array1 = new int[3][2];
        array1[0][0] = 00;
        array1[0][1] = 01;
        array1[1][0] = 10;
        array1[1][1] = 11;
        array1[2][0] = 20;
        array1[2][1] = 21;
        for (int i = 0;i< array1.length;i++)
        {
            System.out.println();
            for(int j=0;j<array1[i].length;j++)
            System.out.print(array1[i][j]+",");
        }


    }

    public void declareWithInitialization() {
        int[][] array1 = {{00,01},
                {10,11}

        };
        for (int i = 0;i< array1.length;i++)
        {
            System.out.println();
            for(int j=0;j<array1[i].length;j++)
                System.out.print(array1[i][j]+",");
        }

    }
}
