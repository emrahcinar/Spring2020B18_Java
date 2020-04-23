package day18_nestedLoops;

import java.util.Scanner;

public class NestedLoop_Practice {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

while(true) {
    System.out.println("Enter two numbers");

    int num1 = input.nextInt();
    int num2 = input.nextInt();
    System.out.println("Select your four operation");
    System.out.println("+     -");
    System.out.println("   %   ");
    System.out.println("*     /");



    System.out.println("Addition of two numbers: " + (num1 + num2));
    System.out.println("Do you want to continue");
    String answer=input.next();
    if (!(answer.equalsIgnoreCase("Yes")|| answer.equalsIgnoreCase("no"))){
        System.out.println("Invalid Entry, please re-enter yes or no");
        answer=input.next();
    }
    if (answer.equalsIgnoreCase("No")){
        System.out.println("Thank you for using the calculator");
        break;
    }
}

        System.out.println("===============================================================");
/*
write a program for the room reservation:

King Bed==>120$
Queen Bed==>100$
Single Bed==>80$

should ask which bedroom do you wanna reserve
if user provided invalid entry => please re-enter

calculate the total price
do you want to reserve another room:
if yes ==> repeat the previous steps
if no ==> your total prices is : $$$

if answer either yes or no ==> please re-enter
 */



































    }
}
