package com.bazlur.java.OOP.inheritance;

public class Human {
   private String name;
   private  int age;

   public void displayInfo(){
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
   }
    public void getColor() {
        System.out.println("Green");
    }

   Human(String name, int age){
       this.name = name;
       this.age = age;
   }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


}
