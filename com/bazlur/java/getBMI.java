package com.bazlur.java;

import java.util.Scanner;

public class getBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Weight: ");
        double weight = input.nextDouble();
        System.out.print("Enter Your Height in meters: ");
        double height = input.nextDouble();
        double BMI = weight / (height*height);
        System.out.println("BMI is "+BMI);
    }
}
