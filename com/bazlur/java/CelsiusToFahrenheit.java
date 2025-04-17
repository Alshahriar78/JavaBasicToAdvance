package com.bazlur.java;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Enter celsius: ");
        celsius = input.nextDouble();
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The celsius is: " + fahrenheit);

    }
}
