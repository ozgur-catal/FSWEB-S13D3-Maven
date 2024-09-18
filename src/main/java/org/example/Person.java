package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    String country;
    String city;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String gender, String country, String city) {
        this(firstName, lastName, age);
        this.gender = gender;
        this.country = country;
        this.city = city;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }
}

