package com.company;
import java.util.Scanner;

public class CWH_05_TakingInputFromUser {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter number 1 :");
//        int a = UserInput.nextInt();
        float a = UserInput.nextFloat();
        System.out.println("Enter number 2 :");
//        int b = UserInput.nextInt();
        float b = UserInput.nextFloat();
//        int sum = a+b;
        float sum = a+b;
        System.out.println("Enter a integer.");
        boolean t = UserInput.hasNextInt();
        if(t){
            System.out.println("You entered a integer");
        }else{
            System.out.println("You entered a wrong number");
        }

        System.out.println(t);
        System.out.println("Sum of the two numbers is :"+ sum);
        /*
        Difference between .next() and .nextLine() is the second one reads the full statement while the first one only reads only one word
        */
        UserInput.close();
    }
}
