package com.bazlur.java.OOP.encapsulation;

public class BankAccountWithEncapsulation {
   private String accountNumber;
   private double balance;

   public BankAccountWithEncapsulation(String accountNumber, double balance){
      this.accountNumber = accountNumber;
       this.balance = balance;
   }
   public void deposit(double amount){
      if(amount <= 0){
         System.out.println("Amount must be positive");
      }
      balance += amount;
   }

   public void withdraw(double amount){
      if(amount <= 0){
         System.out.println("Amount must be positive");
      }
      else if(amount > balance){
         System.out.println("Insufficient balance");
      }
      balance -= amount;
   }
   public double getBalance(){
      return balance;
   }
   public String getAccountNumber(){
      return accountNumber;
   }

   public static void main(String[] args) {
      BankAccountWithEncapsulation bankAccountWithEncapsulation = new BankAccountWithEncapsulation("123456",1000);
      bankAccountWithEncapsulation.deposit(100);
      bankAccountWithEncapsulation.withdraw(200);
      System.out.println("Balance: " + bankAccountWithEncapsulation.getBalance());
      System.out.println("Account Number: " + bankAccountWithEncapsulation.getAccountNumber());
   }
}
