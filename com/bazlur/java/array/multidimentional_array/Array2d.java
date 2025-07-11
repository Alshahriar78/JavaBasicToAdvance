package com.bazlur.java.array.multidimentional_array;

import java.util.Arrays;

public class Array2d {
    public static void main(String[] args) {
        int[][] marksOfStudents={{78,89,74,68,97,88},
                {87,98,47,86,79,88},
                {71,83,74,65,90,75},
                {78,89,74,68,97,88},
                {78,89,74,68,97,88}
        };
        System.out.println(Arrays.toString(marksOfStudents[0]));
        System.out.println(marksOfStudents[0][2]);

        for(int i=0;i<marksOfStudents.length;i++){
            System.out.println(Arrays.toString(marksOfStudents[i]));
            for(int j=0; j<marksOfStudents[i].length;j++){
                System.out.println("marksOfStudents["+i+"]["+j+"] = "+marksOfStudents[i][j]);
            }
        }
    }


}
