package com.sjprogramming;

import java.util.Scanner;

public class MainClass {
    static AtmOperationInterface op = new AtmOperationImpl();

    public static void main(String[] args) {
        int atmnumber = 12345;
        int atmpin = 123;

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.println("Enter ATM Number:");

        int atmNumber =in.nextInt();
        System.out.println("Enter Pin");
        int pin = in.nextInt();

        if (atmnumber== atmNumber && atmpin == pin){
            while(true){

                System.out.println("1. View Available Balance\n2. Withdraw Amount\n3.Deposit Amount\n4.View Ministatementn\n5. Exit from Application");
                System.out.println("Enter Choice: ");
                int ch =in.nextInt();
                if(ch==1){
                    op.viewBalance();
                    
                } else if (ch==2) {
                    System.out.println("Enter amount to withdraw");
                    double withdrawamount =in.nextDouble();
                    op.withdrawAmount(withdrawamount);
                } else if (ch==3) {
                    System.out.println("Enter Amount to deposit:");
                    double depositAmount =in.nextDouble();//5000
                    op.depositAmount(depositAmount);
                } else if (ch==4) {
                    op.virwMiniStatement();
                } else if (ch==5) {
                    System.out.println("Collect your AYM card\n Thank you for using ATM machine");
                    System.exit(0);
                }else {
                    System.out.println("Please Enter correct choice");
                }
            }

        }else {
            System.out.println("Incorrect ATM number or Pin");
            System.exit(0);
        }
    }
}
