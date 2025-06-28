package com.bazlur.java.solid.LSP;

public class Main{
    public static void main(String[] args) {
        IColor color = new Blue();
        color.getColor();

        Green green = new Green();
        green.getColor();
        //output: Blue
    }
}
