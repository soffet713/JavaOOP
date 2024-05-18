package com.doxalearn.LearnJava;

public class Student {
    public String name; // Public objects of derived class can be treated as object of the super class
    public double test1, test2, test3;
    protected String department; // allows derived class to know the details of super class
    private String schoolEmail; // prevents objects of derived class to be treated as objects of super class

    public Student() {
        test1 = 82;
        test2 = 93;
        test3 = 77;
    }

    public void SetEmail(String email) {
        this.schoolEmail = email;
    }

    public void GetEmail() {
        System.out.println(this.schoolEmail);
    }

    public double GetAverage() {
        return (test1 + test2 + test3) / 3;
    }
}
