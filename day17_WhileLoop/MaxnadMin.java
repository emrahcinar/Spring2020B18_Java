package day17_WhileLoop;

import java.util.Scanner;

/*
1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement
 */
public class MaxnadMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxNumber = -2147483647; //any number user provided will be greater than this number
        //first user entered variable will be initilazed to maxNumber
        // maxnumber=5;

        int minNumber = 2147483647;

        for (int i = 1; i <= 5; i++) {// i:1,2,3,4,5
            System.out.println("Enter a number");
            int num = scan.nextInt();//0,1,2,3,0

            if (num > maxNumber) {//to compare each user input, and assign the maximum number to MaxNumber
                maxNumber = num;
            }
            if (num < minNumber) {//to compare each user input, and assign the minimum number to MaxNumber
                minNumber = num;
            }
        }

        System.out.println("Maximum Number: "+maxNumber);
        System.out.println("Minimum Number: "+minNumber);

    }
}
