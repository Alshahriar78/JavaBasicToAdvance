package com.bazlur.java.OOP;

import java.util.Scanner;

public class Person {
    private  String name ;
    private  int age;
    private  String phoneNumber;

    Scanner scanner = new Scanner(System.in);


   public Person(){
       System.out.println("Person Don't Define");
    }


   public Person(String name, int age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void printPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        Person person = new Person("Al Shahoriar",27,"01521507437");
        person.printPerson();
    }
}
