package com.bazlur.java.array;

import java.util.Arrays;

public class ArrayData {

        public static void main(String[] args) {
            String[] name= new String[3];
            name[0]="Sourov";
            name[1]="Ali";
            name[2]="Bazlur";
            for(String i:name){
                System.out.println(i);
            }
            System.out.println(Arrays.toString(name));
            int[] arr = {1,4,7,9,6};
            for(int i =0; i<arr.length;i++){
                System.out.println("Index -> "+i+" Element is: "+arr[i]);
            }
            for(int i:arr){
                System.out.println(i);
            }
             int i=0;
            while(i<arr.length){
                System.out.println("While Loop");
                System.out.println("Index  -> "+i+" Element is: "+arr[i]);
                i++;
            }
        }
}
