package com.doxalearn.LearnJava;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Scanner;

/****************************
***** Classes and Objects ***
****** Constructors *********
****** Pillars of OOP *******
****** Interfaces ***********
****** Constants & Enums ****
* File & Exception Handling *
****************************/

public class Main {

    // Declare const with final keyword
    static final double PI = 3.14159; // Constants declared outside of Main method, MUST contain static keyword

    // Declare enum
    enum Color{
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        PURPLE;

        // enum constructor, will be called for each individual constant
        private Color() {
            System.out.println("Constructor was called for: " + this.toString());
        }

        // Method
        public void colorInfo() {
            System.out.println("These are the colors of the rainbow.");
        }
    }

    public static void main(String[] args) throws IOException {
        DecimalFormat df = new DecimalFormat("#.##");
        final int THRESHOLD = 5;


        Person p1 = new Person(32, "Lee Miles", 'M');
        Person p2 = new Person();

        p2.SetDetails("Janet Green", 41, 'F');

        p1.PrintPersonDetails();
        p2.PrintPersonDetails();


        Date date = new Date(2024, 05, 05, "Cinco de Mayo");
        Date holiday = new Date(2023,12,25,"Christmas");

        date.PrintDate();
        holiday.PrintDate();

        Student s1 = new Student();
        UnderGrad s2 = new UnderGrad();

        s1.name = "Jen Brooks";
        s1.department = "Information Technology";
        s1.SetEmail("jenbrooks@gmail.com");

        s2.name = "Mark Chang";
        s2.department = "Communication";

        System.out.println(s1.name);
        System.out.println(s1.department);
        System.out.println(s1.GetAverage());
        s1.GetEmail();

        System.out.println(s2.name);
        System.out.println(s2.department);
        System.out.println(s2.GetAverage());


        Car corolla = new Car(4,180,false,"Gas");
        SportsCar ferrari = new SportsCar(2,252,true,"Gas");

        corolla.SetColor("Blue");
        corolla.SetDoorType("Regular Doors");
        corolla.GetDetails();
        corolla.Accelerate();

        ferrari.SetColor("Red");
        ferrari.SetDoorType("Butterfly Doors");
        ferrari.GetDetails();
        ferrari.Accelerate();

        Shape r = new Rectangle(2.0,5.0);
        Shape c = new Circle(4);

        double areaRect = r.getArea();
        double areaCir = c.getArea();
        double perimRect = r.getPerimeter();
        double perimCir = c.getPerimeter();

        r.draw();
        System.out.println("Area of Rectangle: " + areaRect);
        System.out.println("Perimeter of Rectangle: " + perimRect);
        c.draw();
        System.out.println("Area of Circle: " + df.format(areaCir));
        System.out.println("Perimeter of Circle: " + df.format(perimCir));

        Person p = new Person(31, "Zach", 'M');
        Dog d = new Dog(3,"Milo",'M');

        p.PrintPersonDetails();
        p.walk();
        d.PrintDetails();
        d.walk();


        Color color = Color.GREEN;

        Color[] colorArray = Color.values();

        // Loop through array and print the colors
        for(Color col : colorArray) {
            System.out.println(col + " at index " + col.ordinal());
        }

        System.out.println(PI);
        System.out.println(THRESHOLD);
        System.out.println(Color.BLUE);
        System.out.println(color);
        color.colorInfo();

        // Try block
        try {
            // Create file
            File myFile = new File("MyFile.txt");

            // Check if the file was created
            boolean isCreated = myFile.createNewFile();
            if(isCreated) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch(IOException e) { // Catch any IO exceptions
            System.out.println("Exception occurred while trying to create file: ");
            e.printStackTrace();
        }

        // Using fileOutputStream
        try(FileOutputStream fileOutputStream = new FileOutputStream("MyFile2.csv")) {
            System.out.println("File successfully created.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path myFile = Paths.get("MyFile3.py");
        try{
            Path checkExists = Files.createFile(myFile);
            System.out.println("File created: " + checkExists);
        } catch(IOException e) { // Catch block
            System.out.println("Exception occurred: ");
            e.printStackTrace();
        }

        // Write to file using Buffered Writer
        String content = "Writing to the file using Buffered Writer.";
        String addContent = "\nAppending some additional content.";

        // Create Buffered object
        BufferedWriter writer = new BufferedWriter(new FileWriter("MyFile.txt",true));
        // Add data to file
        writer.write(content);
        writer.write(addContent);
        // Close writer when finished
        writer.close();


        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a day of the week: ");
        input = scanner.nextLine().toUpperCase();

        DayChecker day = new DayChecker(DayOfWeek.valueOf(input));
        day.CustomMessage();
    }
}