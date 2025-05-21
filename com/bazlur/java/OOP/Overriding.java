package com.bazlur.java.OOP;

public class Overriding  extends Human{
    private String qualification;

    Overriding(String name, int age, String qualification) {
        super(name, age);
        this.qualification = qualification;
    }




    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Qualification: " + qualification);
    }


    public static void main(String[] args) {

        Overriding overriding = new Overriding("Sourov",27,"BSc");
        overriding.displayInfo();
    }
}
