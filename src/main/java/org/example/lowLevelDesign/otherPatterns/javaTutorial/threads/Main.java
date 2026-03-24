package org.example.lowLevelDesign.otherPatterns.javaTutorial.threads;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() ->{
            for(int i=0; i<3; i++){
                account.deposit(300);

                try{
                    Thread.sleep(50);
                } catch (Exception e){

                }
            }
        });

        Thread t2 = new Thread(() ->{
            for(int i=0; i<3; i++){
                account.withdraw(200);
            }

            try {
                Thread.sleep(100);
            } catch (Exception e){

            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e){

        }
        System.out.println("Final balance : "+account.getBalance());
    }
}
