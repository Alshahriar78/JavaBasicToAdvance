package com.bazlur.java.challenge.array;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = {1,2,3,4,5};
        System.out.println("Sum Of an Array: "+main.sumAndAverage(arr)[0]);
        System.out.println("Average Of an Array: "+main.sumAndAverage(arr)[1]);

    }
    public double[] sumAndAverage(int[] arr){
        double sum = 0;
        double avg = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            avg = sum/arr.length;
        }
        double[]  sumAvg = {sum,avg};
        return sumAvg;
    }
}
