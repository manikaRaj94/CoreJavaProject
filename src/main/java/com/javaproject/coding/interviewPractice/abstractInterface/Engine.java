package com.javaproject.coding.interviewPractice.abstractInterface;

public interface Engine {

    void abstractEngineMethod();
    String engine = "Engine";

    public static void engineStaticMethod()
    {
        System.out.println("engineStaticMethod..");
    }
    default void engineDefaultMethod()
    {
        System.out.println("engineDefaultMethod..");
    }

   // private String privateString="Private Engine";


}
