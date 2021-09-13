package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables
        String state, WI = "WI";
        double amount, tax, total;
        Scanner sc = new Scanner(System.in);

        //scan user input
        System.out.println("What is the order amount?");
        amount = sc.nextDouble();
        System.out.println("What is the state?");
        state = sc.next();

        //Round the amount
        amount = Math.round(amount*100.0)/100.0;
        total = amount;

        //Calculate and print tax if user from WI
        if(state.compareTo(WI) == 0) {
            System.out.println("The subtotal is $" + amount +".");
            tax = amount * 0.055;
            tax = Math.round(tax*100.0)/100.0;
            System.out.println("The tax is $" + tax + ".");
            total = amount + tax;
        }

        //print findings
        System.out.println("The total is $" + total + ".");

        sc.close();
    }
}