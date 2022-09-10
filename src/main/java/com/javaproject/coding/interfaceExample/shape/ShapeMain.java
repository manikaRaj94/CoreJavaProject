package com.javaproject.coding.interfaceExample.shape;

public class ShapeMain {
    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.area();
        Shape rectangle = new Rectangle();
        rectangle.area();
        Shape square = new Square();
        square.area();

    }
}
