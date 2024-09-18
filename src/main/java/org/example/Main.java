package org.example;

import org.example.Person;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");


        Person person1 = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("Lastname: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("IsTeen: " + person1.isTeen());


        Person person2 = new Person("Johnny", "Doe", 18, "Female", "ABD", "New York");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("Lastname: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("IsTeen: " + person2.isTeen());


        Wall wall = new Wall(5, 4);
        System.out.println("Width: " + wall.getWidth());
        System.out.println("Height: " + wall.getHeight());
        System.out.println("Area: " + wall.getArea());


        wall.setHeight(4);
        wall.setWidth(-2);
        System.out.println("Height: " + wall.getHeight());
        System.out.println("Width: " + wall.getWidth());
        System.out.println("Area: " + wall.getArea());
    }

}

