package com.doxalearn.LearnJava;

public abstract class Shape {
    private String color;

    public Shape() {
        this.color = "Unknown";
    }

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    //Abstract methods
    public abstract void draw();
    public abstract double getArea();
    public abstract double getPerimeter();
}
