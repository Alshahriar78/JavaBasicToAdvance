package com.bazlur.java.control_flow;

import java.util.Scanner;

public class GradeCalculator {
    public char getGrade(int marks) {
        if(marks >=101){
           return 'E';
        }
       else if (marks >=80 ) {
          return 'A';
        } else if (marks >=60 ) {
            return 'B';

        } else if (marks >=50) {
            return 'C';
        } else if (marks >=40 ) {
            return 'D';
        }

        return 'F';
    }



     public static void main(String[] args) {
        GradeCalculator gc = new GradeCalculator();
        System.out.println(gc.getGrade(56));
    }

    public static class ComputeArea {

        public static void main(String[] args){
           double CircleArea = CircleArea();
            double RectangleArea=RectangleArea();
            System.out.println("The Area of  Circle is = "+CircleArea);
            System.out.println("The Area of  Rectangle  is = "+RectangleArea);
        }
        static double CircleArea(){
            Scanner scanner = new Scanner(System.in);
            double radius;
            System.out.println("Enter The circle Radios:");
            radius = scanner.nextDouble();
            return radius*radius *3.14159;
        }
        static double RectangleArea(){
            Scanner scanner = new Scanner(System.in);
            double length;
            System.out.println("Enter the length of Rectangle: ");
            length = scanner.nextDouble();
            double width;
            System.out.println("Enter the length of Rectangle: ");
            width = scanner.nextDouble();
            return length * width;
        }
    }
}
