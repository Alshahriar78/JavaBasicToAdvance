package com.bazlur.java.control_flow;

import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Weight Converter");
        System.out.println("Option 1 is lbs to kgs");
        System.out.println("Option 2 is kgs to lbs");
        // declare variable
        double weight ;
        double newWeight;
        int choice;
        // user input
        System.out.println("Choice any Option 1 or 2");
        choice = scanner.nextInt();

        // applying Logic
        if(choice==1){
            System.out.println("Enter The Weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight *  0.453592;
            System.out.printf("The converted kgs  weight is %.2f ",newWeight);
        }else if(choice==2){
            System.out.println("Enter The Weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight *  2.20462;
            System.out.printf("The converted lbs  weight is %.2f ",newWeight);
        }else{
            System.out.println("This is not valid Choice");
        }
    scanner.close();
    }
}