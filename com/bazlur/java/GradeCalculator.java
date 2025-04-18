package com.bazlur.java;

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

}
