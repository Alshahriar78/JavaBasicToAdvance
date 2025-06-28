package com.bazlur.java.problem_solved;

import java.util.Scanner;
public class CompoundInterestCalculator {
    public static void main(String[] args) {


        //  CI = P (1 + r/n)nt - P
//        A	=	final amount
//                P	=	initial principal balance
//        r	=	interest rate
//                n	=	number of times interest applied per time period
//                t	=	number of time periods elapsed

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter The principal Balance: ");
        double PrincipalBalance = scanner.nextDouble();

        System.out.println("Enter The Interest Rate in (%): ");
        double Rate = scanner.nextDouble()/100;

        System.out.println("Enter # Times Compound Per Year ");
        int TimeCompound = scanner.nextInt();

        System.out.println("Enter #   Year ");
        int Years = scanner.nextInt();

        double Amount = PrincipalBalance *(Math.pow(1+Rate/TimeCompound,TimeCompound*Years));
        System.out.println(Amount);



    }
}