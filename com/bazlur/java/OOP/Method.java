package com.bazlur.java.OOP;

public class Method {
    public static void main(String[] args) {
        Method  method = new Method();
        method.greetings();

        int result = Method.addition(10,20);
        System.out.println("Result: " + result);
    }

    //non-static method that's why need a creation object then call it through an object
    // return type void
    public  void greetings(){
        System.out.println("Good Morning. Happy Coding");
    }

    //static method that's why don't need a creation object
    // return type int
    public static int  addition(int a, int b){
        return a+b;
    }

}
