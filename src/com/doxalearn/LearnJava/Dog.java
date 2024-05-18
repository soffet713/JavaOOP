package com.doxalearn.LearnJava;

public class Dog implements Walkable{
    int age;
    String name;
    char sex;

    Dog() {};

    Dog(int age, String name, char sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public void setDetails(int age, String name, char sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public void PrintDetails() {
        System.out.println("Dog name: " + name);
        System.out.println("Dog age: " + age);
        System.out.println("Dog sex: " + sex);
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking...");
    }
}
