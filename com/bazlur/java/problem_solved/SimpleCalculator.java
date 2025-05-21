package com.bazlur.java.problem_solved;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Simple Calculator");
        System.out.print("Enter the first number: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.print("Enter the second number: ");
        int num2 = Integer.parseInt(System.console().readLine());
        System.out.print("Enter the operator (+, -, *, /): ");
        String operator = System.console().readLine();
        int result = 0;
        switch (operator) {
            case "+": result = num1 + num2;break;
            case "-": result = num1 - num2;break;
            case "*": result = num1 * num2 ;break;
            case "/": result = num1 / num2;break;
            case "%": result = num1%num2;break;
            default: System.out.println("Invalid Operator");
        }
        System.out.println("Result : " + result);
    }
}
