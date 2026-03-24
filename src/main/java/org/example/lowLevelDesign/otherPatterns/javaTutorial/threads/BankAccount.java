package org.example.lowLevelDesign.otherPatterns.javaTutorial.threads;

public class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount){
        balance += amount;
        System.out.println("deposited : "+amount +" balance: "+balance);
    }

    public synchronized void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("withdraw : "+amount +" balance: "+balance);
        } else{
            System.out.println("insufficient balance");
        }
    }
 public int getBalance(){
        return this.balance;
 }
}
