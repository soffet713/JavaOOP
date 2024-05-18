package com.doxalearn.LearnJava;

public class Vehicle {
    private String color;
    private int numDoors;
    private boolean turbo;
    private int topSpeed;
    private String fuelType;

    public Vehicle(int numDoors, int speed, boolean turbo, String fuel) {
        this.numDoors = numDoors;
        this.topSpeed = speed;
        this.turbo = turbo;
        this.fuelType = fuel;
    }

    public void Accelerate() {
        System.out.println("The vehicle is speeding up...");
    }

    public void Decelerate() {
        System.out.println("The vehicle is slowing down...");
    }

    public void SetColor(String color) {
        this.color = color;
    }

    public void GetDetails() {
        System.out.println("Color: " + this.color);
        System.out.println("No. of doors: " + this.numDoors);
        System.out.println("Top Speed: " + this.topSpeed + " km/h");
        System.out.println(turbo ? "Has a turbo." : "No turbo included."); // Ternary operator
    }
}
