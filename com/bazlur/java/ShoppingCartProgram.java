package com.bazlur.java;

import java.util.Scanner;
public class ShoppingCartProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        double total;
        String curency ="BDT";

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("What is the Price of this Item?: ");
        price = scanner.nextDouble();
        System.out.print("How many item Would you like to buy?: ");
        quantity = scanner.nextInt();


        total = quantity *  price;

        System.out.println(quantity +" Pieces of " +item + " .Total price is "+total+curency);
        System.out.println("You have to pay " +total+curency);
    }
}