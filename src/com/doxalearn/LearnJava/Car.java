package com.doxalearn.LearnJava;

public class Car extends Vehicle{
    private String doorType;

    public Car(int numDoor, int speed, boolean turbo, String fuel) {
        super(numDoor, speed, turbo, fuel);
    }

    public void SetDoorType(String doorType) {
        this.doorType = doorType;
    }

    public void GetDetails() { // Polymorphism
        super.GetDetails();
        System.out.println("Door Type: " + doorType);
    }
}
