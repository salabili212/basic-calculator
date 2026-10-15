package com.pluarsight;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //Welcome the user to our basic calculator
        System.out.println("########Welcome to Basic Calculater########");

        //Get the first input
        System.out.println("Please enter the first number.");
        double  firstNumber = myScanner.nextInt();

        //Take the operator that user want to use for calcualte -+* or /
        System.out.println("please enter the opoarator that want you to use.");
        System.out.println("(*)Multiply\n(+)Add\n(-)Subtract\n(/)Divide");
        String operator = myScanner.next();
        char Operator1= operator.charAt(0);

        //Take the second input
        System.out.println("please enter a second number.");
        double secondNumber = myScanner.nextInt();


        //Calculation place
        if(Operator1 == '*'){
            System.out.println("The result is: "+ (firstNumber * secondNumber));
        } else if (Operator1 == '+') {
            System.out.println("The result is: "+ (firstNumber + secondNumber));
        } else if (Operator1 == '-') {
            System.out.println("The result is: " + (firstNumber - secondNumber));
        } else if (Operator1 == '/') {
            System.out.println("The result is: "+ (firstNumber - secondNumber));

        }


    }
}
