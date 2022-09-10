package com.javaproject.coding.inhertiance;

public class InheritanceMainClass {

    public static void main(String[] args) {
        DerivedClass obj1 = new DerivedClass();
        obj1.method(30);
        obj1.method(obj1.baseValue);
        obj1.method(10,30);

        BaseClass obj2 = new DerivedClass();
        obj2.method(40);
        obj2.method(obj2.baseValue);

        BaseClass obj3 = new BaseClass();
        obj3.method(50);
        obj3.method(obj3.baseValue);

        BaseClass obj4 = new BaseClass(5);


    }

}
