package com.bazlur.java.challenge.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = {1,2,3,4,5};
        System.out.println("Sum Of an Array: "+main.sumAndAverage(arr)[0]);
        System.out.println("Average Of an Array: "+main.sumAndAverage(arr)[1]);
        int[]arr2 ={1,2,3,2,2,4,2,5,2};
        System.out.println("Number of Occurrence of an Element: "+main.numberOccurrence(arr2,2));
        System.out.println("Maximum Element of an Array: "+main.maxFind(arr2));
        System.out.println("Minimum Element of an Array: "+main.minFind(arr2));
        System.out.println("Amount of Occurrence of an Element: "+main.amountOfOccurrence(arr2,2));
        System.out.println("Is Array Sorted: "+main.checkSorted(arr));
        System.out.println("Delete Element: "+ Arrays.toString(main.deleteElement(arr, 2)));
        System.out.println("Reverse an Array "+ Arrays.toString(main.reverseArray(arr)));
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

    public int numberOccurrence(int[] arr,int element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        return count;
    }

    // Problem: Maximum & Minimum element of an Array
    public int maxFind(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    // Problem:Minimum element of an Array
    public int minFind(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    // Amount of Occurrence of An Array Element
    public int amountOfOccurrence(int[] arr,int element){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                count++;
            }
        }
        return count;
    }

    // Check Array Is Sorted or not
    public Boolean checkSorted(int[] arr){
        boolean sorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sorted = false;
                break;
            }
        }
        return sorted;
    }

    //Delete Specific Element In an Array & Return New Array
    public int[] deleteElement(int[] arr,int element){
        int[] newArr = new int[arr.length-1];
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=element){
                newArr[i] = arr[j];
                i++;
            }
        }
        return newArr;
    }

    //Reverse an Array
    public int[] reverseArray(int[] arr){
        int[] newArr = new int[arr.length];
        for(int j=0;j<arr.length;j++){
            newArr[j] = arr[arr.length-1-j];
        }
        return newArr;
    }

}
