package com.javaproject.coding.interfaceExample.animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animalDog = new Dog();
        animalDog.move();
        Animal animalBird = new Bird();
        animalBird.move();
        Animal animalFish = new Fish();
        animalFish.move();

    }
}
