package com.bazlur.java.problem_solved;

import java.util.Scanner;

public class PrintData {
    String name;
    int age;
    double salary;
    boolean isMarried;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.println("Enter Your Salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter Your Marital Status: ");
        boolean isMarried = scanner.nextBoolean();
        System.out.println("Your Name is: " +name);
        System.out.println("Your Age is: " +age);
        System.out.println("Your Salary is: " +salary+ "BDT");
        System.out.println("Your Marital Status is: " +isMarried);

    }


}
