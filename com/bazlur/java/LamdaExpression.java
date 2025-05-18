package com.bazlur.java;

import java.util.Comparator;

public class LamdaExpression {



    public static void main(String[] args) {
        LamdaExpression lamdaExpression = new LamdaExpression();
        lamdaExpression.runnable.run();
        System.out.println(lamdaExpression.comparator.compare(1,2));
    }
    Comparator<Integer> comparator = (a, b) -> a.compareTo(b);


    Runnable runnable = () -> {
        System.out.println("Running thread");
    };

}
