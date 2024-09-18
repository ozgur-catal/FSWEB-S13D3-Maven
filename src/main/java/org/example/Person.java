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
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isTeen(){
        return this.age >= 13 && this.age <= 19;
    }
    public  String getGender(){
        return  this.gender;
    }
    public  String getCountry(){
        return this.country;
    }
    public String getCity(){
        return this.city;
    }
}

