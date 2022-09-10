package com.javaproject.coding.arrayExample;

public class twoDimensional {
    public static void main(String[] args) {
        boolean arr[] = new boolean[5];
        for (int i =0 ;i<5;i++)
        {
            if(i%2==0)
                arr[i] = true;
            else
                arr[i] = false;
        }

        for(int i =0 ;i<5;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }
}
