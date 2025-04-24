package com.bazlur.java;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class STRING {
    public static void main(String[] args) {
//        String Name = "Al Shahoriar";
//        char result = Name.charAt(4);
//        int WordLength = Name.length();
//        System.out.println(result);
//        System.out.println(WordLength);
//        // contains('matching condition')
//        if(Name.contains(" ")){
//            System.out.printf("The %s Takes Spaces\n", Name);
//        }
        //substring(start, end)
          Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Your Email:");
//        String email = scanner.nextLine();
//        if(email.contains("@")){
//            String userName = email.substring(0,email.indexOf("@"));
//            String domain = email.substring(email.indexOf("@")+1);
//            System.out.println(userName);
//            System.out.println(domain);
//        }else{
//            System.out.println("Email Must Contains @ ");
//        }
         // ternary Operator
         // type variable = (condition) ? "True" : "False";
          int age;
          System.out.print("Enter Your Age:");
          age = scanner.nextInt();
          String isOld = (age>=18) ? "Adult" : "Child";
          System.out.printf("You are %s.\n",isOld);

          String isEven = (age%2==0) ? "Even Number":"Odd Number";
          System.out.printf("The Number Is %s.",isEven);


     scanner.close();
    }
}