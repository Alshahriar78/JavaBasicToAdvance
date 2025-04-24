package com.bazlur.java;

import java.util.Scanner;

public class getBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Weight: ");
        double weight = input.nextDouble();
        System.out.print("Enter Your Height in meters: ");
        double height = input.nextDouble();
        double BMI = weight / (height*height);
        System.out.println("BMI is "+BMI);
    }

    public static class Find2dArrayLargestHourGlass {
        public static void main(String[] args) {
            // Sample 6x6 array
            int[][] arr = {
                    {1, 1, 1, 0, 0, 0},
                    {0, 1, 0, 0, 0, 0},
                    {1, 1, 1, 0, 0, 0},
                    {0, 0, 2, 4, 4, 0},
                    {0, 0, 0, 2, 0, 0},
                    {0, 0, 1, 2, 4, 0}
            };

            int maxSum = Integer.MIN_VALUE;


            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    int sum =
                            arr[i][j]     + arr[i][j+1]     + arr[i][j+2] +
                                    arr[i+1][j+1] +
                                    arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }

            System.out.println("Maximum Hourglass Sum: " + maxSum);
        }
    }
}
