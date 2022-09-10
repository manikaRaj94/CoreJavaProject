package com.javaproject.coding.arrayExample;

import java.util.Scanner;

public class arrayExample {
    public static void main(String[] args) {

        int arr[] = new int[26];

         int num =0;

         char arrChar[] = new char[26];

         for(int i =90 ; i>=65 ; i--)
         {
             arrChar[num] = (char) i;
             num++;
         }
         num=0;
         for(char a ='A' ; a <= 'Z' ; a++)
         {
             arr[num] =  a;
             num++;
         }

         for(int i=0;i<arrChar.length;i++)
         {
             System.out.print(arrChar[i]+" ");
         }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

}
