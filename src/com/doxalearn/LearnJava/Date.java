package com.doxalearn.LearnJava;

public class Date {

    private int day;
    private int month;
    private int year;
    private String holiday;

    public Date() { // Default constructor
        // Define values for each data member
        day = 0;
        month = 0;
        year = 0;
    }

    public Date(int y, int m, int d) { // Parameterized constructor
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public Date(int year, int month, int day, String holiday) { // Overloaded parameterized constructor
        this(year, month, day); // Calling the parameterized constructor
        this.holiday = holiday;
    }

    // Function to print date
    public void PrintDate() {
        System.out.println("Date: " + year + "/" + month + "/" + day + " --> " + holiday);
    }
}
