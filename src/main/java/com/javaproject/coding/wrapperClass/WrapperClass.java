package com.javaproject.coding.wrapperClass;

public class WrapperClass {
    static Byte byteDataType;
    static Integer intDataType;
    static Long longDataType;
    static Float floatDataType;
    static Double doubleDataType;
    static Character charDataType;
    static Short shortDataType;
    public static void main(String[] args) {
        Byte byteDataType = 127;
        Integer intDataType = 999999999;
        Long longDataType = 999999999999999999l;
        Float floatDataType = 99999999999999999999999999999999999999f;
        Double doubleDataType = 9d;
        Character charDataType = 'A';
        Short shortDataType = 999;


        System.out.println("byteDataType value: " + byteDataType);
        System.out.println("intDataType value: " + intDataType);
        System.out.println("longDataType value: " + longDataType);
        System.out.println("floatDataType value: " + floatDataType);
        System.out.println("doubleDataType value: " + doubleDataType);
        System.out.println("charDataType value: " + charDataType);
        System.out.println("shortDataType value: " + shortDataType);
    }
}
