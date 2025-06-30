package com.bazlur.java.array;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Array Searching\n");
        System.out.print("Enter the element to search: ");
        int element = scanner.nextInt();
        int[] numbers ={4,6,8,2,9};
        boolean result = search(numbers,element);
        if(result){
            System.out.println("Your Number Found In Array.");
        }else{
            System.out.println("Your Number Not Found In Array.");
        }
    }

    public static boolean search(int[] numbers, int element) {
        for(int i = 0; i<numbers.length;i++){
            if(numbers[i]==element){
                return true;
            }
        }
        return false;
    }
}
