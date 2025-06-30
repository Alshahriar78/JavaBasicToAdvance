package com.bazlur.java.challenge.array;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = {1,2,3,4,5};
        System.out.println("Sum Of an Array: "+main.sumAndAverage(arr)[0]);
        System.out.println("Average Of an Array: "+main.sumAndAverage(arr)[1]);
        int[]arr2 ={1,2,3,2,2,4,2,5,2};
        System.out.println("Number of Occurrence of an Element: "+main.numberOccurrence(arr2,2));
    }

    //Problem: Sum & Average of all element In Array
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

    //Problem: Number Occurrence of An Element In a Array

    public int numberOccurrence(int[] arr,int element){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                count++;
            }
        }
        return count;

    }
}
