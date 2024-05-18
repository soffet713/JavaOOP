package com.doxalearn.LearnJava;

public class SportsCar extends Car{

    public SportsCar(int numDoors, int speed, boolean turbo, String fuel) {
        super(numDoors, speed, turbo, fuel);
    }

    public void Accelerate() {
        System.out.println("Zero to 100 in 6 seconds...");
    }
}
