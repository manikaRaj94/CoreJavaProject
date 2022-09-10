package com.javaproject.coding.String;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();
        //printing default string builder capacity
        System.out.println("default capacity = " + stringBuilder1.capacity());

        StringBuilder stringBuilder2 = new StringBuilder("string builder");

        // printing the current capacity of the string builder i.e. 16 + 14
        System.out.println("capacity = " + stringBuilder2.capacity());

        stringBuilder2 = new StringBuilder("A");

        // printing the current capacity of the string builder i.e. 16 + 1
        System.out.println("capacity = " + stringBuilder2.capacity());

        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("hi ");
        System.out.println("capacity hi = " + stringBuilder3.capacity());
        stringBuilder3.append("hello ");
        System.out.println("capacity hello= " + stringBuilder3.capacity());
        stringBuilder3.append("how are you");//now (16*2)+2=34 i.e (oldcapacity*2)+2
        System.out.println("capacity how are you= " + stringBuilder3.capacity());
        // stringBuffer.capacity(); // inital capacity - 16 chars

        System.out.println("stringBuilder3 value = "+stringBuilder3);
        System.out.println("stringBuilder3 capacity "+ stringBuilder3.capacity());



    }
}
