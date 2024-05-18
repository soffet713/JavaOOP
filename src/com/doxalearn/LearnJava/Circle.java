package com.doxalearn.LearnJava;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        super("Blue");
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }
}
