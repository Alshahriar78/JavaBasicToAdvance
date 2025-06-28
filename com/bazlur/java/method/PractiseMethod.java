package com.bazlur.java.method;

import java.util.Scanner;

public class PractiseMethod {

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }
    public static int sumTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        int number1 = readNumber();
        System.out.println("The number is: " + number1);
        int number2 = readNumber();
        System.out.println("The number is: " + number2);
        int result = sumTwoNumbers(number1, number2);
        System.out.println("The sum is: " + result);
    }
}
