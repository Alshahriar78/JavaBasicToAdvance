package com.bazlur.java;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        // pre-test loo (for while)
        double result = 5;
        // for loop
        for (int i = 1; i < 10; i++) {
            // namota
            System.out.println(result + "x"+ i + " = " +(result *i));
        }


        // post -test loop(Do While)
        boolean i = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            String str = sc.nextLine();

            if (str.equals("quit")) {
                i = false;
                break;
            }
        }while (true);

        for (int j = 1; j < 10; j++) {
            if(j%2==0){
                continue; // avoid when this condition true.
            }
            System.out.println(j);
            if(j==7){
                break; // closing the loop when j ==7 condition true n
            }
        }
    }//main method

}// class
