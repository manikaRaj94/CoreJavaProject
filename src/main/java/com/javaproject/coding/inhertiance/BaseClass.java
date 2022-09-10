package com.javaproject.coding.inhertiance;

public class BaseClass {

    public int baseValue = 20;

    public void method(int i)
    {
        System.out.println("Inside base class method(int i)..value:"+i);
    }

    public void method(int i,String str)
    {
        System.out.println("Inside base class method(int i,String str)..value: "+i+" str : "+str);
    }
    public int method(int i,int j)
    {
        System.out.println("Inside base class method(int i,int j)..value: "+i+" j : "+j);
        return i;
    }
    public BaseClass()
    {
        System.out.println("Inside Base class Constructor()");
    }

    public BaseClass(int i)
    {
        System.out.println("Inside Base Class Constructor(int i)");
    }
}
