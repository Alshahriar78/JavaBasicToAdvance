package com.bazlur.java.OOP;

public class Person {
    private  String name ;
    private  int age;

    private  String phoneNumber;
    private  String address;
    private  String gender;



    // default constructor
   public Person(){
    }

    // constructor overloading with parameter 2
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void personsDetailsWithTwoParameters(){
        System.out.println("Name: " + name+ "\n" + "Age: " + age  );
    }

    // constructor overloading with parameter 3
    // its call constructor parameter overloading
   public Person(String name, int age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
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
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


    public void printPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {

        System.out.println("This is constructor call with two parameters");
        Person sourov = new Person("Sourov",27);
        sourov.personsDetailsWithTwoParameters();


        System.out.println("========================== This is constructor call with three parameters");
        Person shahoriar = new Person("Al Shahoriar",
                27,
                "01521507437"); // parameterized constructor initialization
        shahoriar.printPerson();

        System.out.println("========================== This is Encapsulation Approach");
        Person person1 = new Person();
        person1.setAge(27);
        person1.setName("Sourov Hossain");
        person1.setPhoneNumber("+8801755684137");
        person1.setAddress("Dhaka");
        person1.setGender("Male");


        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getPhoneNumber());
        System.out.println(person1.getAddress());
        System.out.println(person1.getGender());


    }
}
