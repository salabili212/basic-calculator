package com.pluarsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("########Welcome to Basic Calculater########");

        System.out.print("Enter the first number: ");
        int firstNumber = myScanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = myScanner.nextInt();

        System.out.println("\nPossible calculations:");
        System.out.println("  (A)dd");
        System.out.println("  (S)ubtract");
        System.out.println("  (M)ultiply");
        System.out.println("  (D)ivide");

        System.out.print("Please select an option: ");
        myScanner.next(); // Read the choice. This exercise always multiplies.

        int result = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + result);
    }
}