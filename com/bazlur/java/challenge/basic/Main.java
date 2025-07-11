package com.bazlur.java.challenge.basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner fahrenheit = new Scanner(System.in);
//        System.out.println("Please enter the temperature in Celsius: ");
//        System.out.print("Converted Fahrenheit: "+obj.celsiusToFahrenheit(fahrenheit.nextDouble()));
//        System.out.println();
//        Scanner celsius = new Scanner(System.in);
//        System.out.println("Please enter the temperature in Fahrenheit: ");
//        System.out.println("Converted Celsius" +obj.fahrenheitToCelsius(celsius.nextDouble()));
//        System.out.println();
//        Scanner radius = new Scanner(System.in);
//        System.out.println("Please enter the radius of the circle: ");
//        System.out.println("Area of the circle: "+obj.circleArea(radius.nextDouble()));
//        System.out.println();
//        Scanner number = new Scanner(System.in);
//        System.out.println("Please enter the number for which you want the multiplication table: ");
//        obj.multiplicationTable(number.nextInt());
//        System.out.println();
//        Scanner n = new Scanner(System.in);
//        System.out.println("Please enter the number for which you want the sum of even numbers: ");
//        System.out.println("Sum of odd numbers: "+obj.sumOfOddNumbers(n.nextInt()));
//        System.out.println();
//        Scanner m = new Scanner(System.in);
//        System.out.println("Please enter the number for which you want the sum of odd numbers: ");
//        System.out.println("Sum of even numbers: "+obj.sumOfEvenNumbers(m.nextInt()));
//        System.out.println();
//        Scanner factorial = new Scanner(System.in);
//        System.out.println("Please enter the number for which you want the factorial: ");
//        System.out.println("Factorial: "+obj.factorial(factorial.nextInt()));
//        Scanner positive = new Scanner(System.in);
//        System.out.println("Please enter the number for which you want the factorial: ");
//        System.out.println("Factorial: "+obj.factorialOfPositiveNumber(positive.nextInt()));
        Scanner number = new Scanner(System.in);
        System.out.print("Please enter the number for which you want the sum of digits: ");
        System.out.println("Sum of digits: "+obj.sumOfDigits(number.nextInt()));
    }

    // Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius){
        return (celsius*9/5)+32;
    }

    // Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit){
        return  5*(fahrenheit-32)/9;
    }
    // Compute area
    public double circleArea(double radius){
        double area = radius * radius;
        return area;
    }
    // Multiplication Table of a Given Number
    public void multiplicationTable(int number){
        for(int i=1;i<=10;i++){
            System.out.println(number+" x "+i+" = "+number*i);
        }
    }

    // Sum of Odd number till the number N that user input
    public int sumOfOddNumbers(int n){
        int sum =0;
        for(int i =1;i<=n;i+=2){
            sum+=i;
        }
        return sum;
    }

    // Sum of Odd number till the number N that user input
    public  int sumOfEvenNumbers(int n){
        int sum =0;
        for(int i =1;i<=n;i+=2){
            sum+=i;
        }
        return sum;
    }
    //factorial of a Number
    public int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    // Factorial of a Positive number
    public int factorialOfPositiveNumber(int n){

        int result = 1;
        if(n>=0) {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
        else{
            return -1;
        }
    }

    public int sumOfDigits(int n){
        int sum =0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
