package com.javaproject.coding.String;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuilder stringBuffer1 = new StringBuilder();
        //printing default string buffer capacity
        System.out.println("default capacity = " + stringBuffer1.capacity());

        StringBuilder stringBuffe2 = new StringBuilder("string buffer");

        // printing the current capacity of the string buffer i.e. 16 + 13
        System.out.println("capacity = " + stringBuffe2.capacity());

        stringBuffe2 = new StringBuilder("A");

        // printing the current capacity of the string buffer i.e. 16 + 1
        System.out.println("capacity = " + stringBuffe2.capacity());

        StringBuffer stringBuffer = new StringBuffer(); // 16
        stringBuffer.append("hi "); // 14
        System.out.println("capacity hi = " + stringBuffer.capacity());
        stringBuffer.append("hello "); // 9
        System.out.println("capacity hello= " + stringBuffer.capacity());
        stringBuffer.append("how are you");//now (16*2)+2=34 i.e (oldcapacity*2)+2
        System.out.println("capacity how are you= " + stringBuffer.capacity());
        
       // stringBuffer.capacity(); // inital capacity - 16 chars

        System.out.println("StringBuffer value = "+stringBuffer);
        System.out.println("StringBuffer capacity "+ stringBuffer.capacity());

    }
}
