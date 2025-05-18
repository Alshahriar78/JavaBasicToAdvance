package com.bazlur.java.problem_solved;

public class IsEven {
    public boolean isEven(int number) {
        if (number % 2 == 0){
            return true;
        }else
            return false;
    }
    public static void main(String[] args) {
        IsEven isEven = new IsEven();
        boolean iseven = isEven.isEven(5);
        System.out.println(iseven);
    }
}
