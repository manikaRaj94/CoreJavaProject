package com.javaproject.coding.String;

public class StringExamples {
    public static void main(String[] args) {

//        String s1 = "Manika"; /// String literal
//        String s2 = new String("manika"); // new keyword
//        String s3 = "Manika";
//        int a= 10 ;
//        a =20;
//        String abc ="This is a statement"; // group of charters together
//
//        System.out.println("s1==s2 : "+(s1==s2));  // == -- compare address
//        System.out.println("s1.equals(s2) : "+s1.equals(s2));
//        System.out.println("s3==s1 : "+(s3==s1));
//        System.out.println("s1.equals(s2) : "+s1.equalsIgnoreCase(s2));


        //==============================================================


        String string1 = new String();

        
        //printing default string  length
        System.out.println("default length = " + string1.length());

        String string2 = new String("string buffer");


        System.out.println("length = " + string2.length());

        string2 = new String("A");


        System.out.println("length = " + string2.length());

        String string3 = "hi";
        // string3.concat("hi ");
        //  System.out.println("capacity hi = " + string3.length());
        String string4 = string3.concat("hello ");
        System.out.println("length hello= " + string3.length());
        System.out.println("length hello= " + string4.length());
        string3.concat("how are you");
        System.out.println("length how are you= " + string3.length());
        // stringBuffer.capacity(); // inital capacity - 16 chars

        System.out.println("string3 value = " + string3);
        System.out.println("string3 capacity " + string3.length());

        String newString1 = new String("hi");
        System.out.println("length of new String hi= " + newString1.length());
        newString1.concat("hello ");
        System.out.println("length of new String hello= " + newString1.length());
        newString1.concat("how are you ");
        System.out.println("length of new String hello= " + newString1.length());


    }
}
