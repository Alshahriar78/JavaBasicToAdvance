package com.bazlur.java.control_flow;

import java.util.Scanner;

public class PrintingPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        for(int i=0;i<=row;i++) {
            for(int col=0;col<=i;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
