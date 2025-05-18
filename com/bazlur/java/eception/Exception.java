package com.bazlur.java.eception;

public class Exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        double result = 0;
        try {
             result = divide(a,b);
        }
        catch (ArithmeticException e){
            System.out.println("You can'not divide" + a+" by " +b);
        }
        System.out.println(result);
    }

    public static double divide(int a, int b){
        return a/b;
    }
}
