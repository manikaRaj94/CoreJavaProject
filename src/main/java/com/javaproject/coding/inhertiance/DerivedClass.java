package com.javaproject.coding.inhertiance;

public class DerivedClass extends BaseClass{

    @Override
    public void method(int i) {
      //  super.method(i);
        System.out.println("Inside Derived Class method()...value: "+i);
    }

    public DerivedClass()
    {
        super();
        System.out.println("Inside Derived Class Constructor");
    }
}
