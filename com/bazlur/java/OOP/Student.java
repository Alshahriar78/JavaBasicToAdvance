package com.bazlur.java.OOP;

public class Student extends Human {
    public Student(String name){
        super(name,0);
    }
    int rollNo;
    double grade;
    boolean isGiveExam;

    public void study(){
        System.out.println(getName() +" is studying for Prepare for Exam. "+"Roll No is "+rollNo);
    }

    public void giveExam(){
          if(isGiveExam) {

              if (grade >= 3.0 && grade <= 4.0) {
                  System.out.println(getName() + " is giving exam Great. " + "Grade is " + grade);
              }
              else if (grade >= 2.75 && grade <=2.99 ) {
                  System.out.println(getName() + " is giving exam Good. " + "Grade is " + grade);
              }
              else if (grade >= 2.5 && grade <= 2.74) {
                  System.out.println(getName() + " is giving exam Average. " + "Grade is " + grade);
              }
              else {
                  System.out.println(getName() + " is giving exam Bad. " + "Grade is " + grade);
              }
          }
          else{
            System.out.println(getName() +" is not prepared for giving exam");
         }
    }
    public static void main(String[] args) {
        Student student = new Student("AL Shahoriar");
        student.rollNo=123456;
        student.grade=3.5;
        student.isGiveExam=true;
        student.study();
        student.giveExam();

    }


}
