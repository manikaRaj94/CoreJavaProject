package com.javaproject.coding.arrayProgram;

public class arrayProgramMainClass {
    public static void main(String[] args) {
        OneDimensionalArray oneDimensionalArray=new OneDimensionalArray();
        TwoDimensionalArray twoDimensionalArray= new TwoDimensionalArray();
        System.out.println(" calling  oneDimensionalArray.declareThenInitialize()");
        oneDimensionalArray.declareThenInitialize();
        System.out.println(" calling  oneDimensionalArray.declareWithInitialization()");
        oneDimensionalArray.declareWithInitialization();
        System.out.println(" calling  twoDimensionalArray.declareThenInitialize()");
        twoDimensionalArray.declareThenInitialize();
        System.out.println(" calling  twoDimensionalArray.declareWithInitialization()");
        twoDimensionalArray.declareWithInitialization();
    }
}
