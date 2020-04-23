package SelfPractice.SelfPractice_Loop;

import java.util.Scanner;

public class Room_Price {
    public static void main(String[] args) {
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


        Scanner scan = new Scanner(System.in);
        int price = 0;
        int king = 120;
        int queen = 100;
        int single = 80;

        System.out.println("Well come to Celebrity Cruise Lines");
        while (true) {
            System.out.println("What type of room would you prefer the reserve?");
            String roomType = scan.nextLine();
            while (!(roomType.equalsIgnoreCase("king bed") || roomType.equalsIgnoreCase("Queen bed") ||
                    roomType.equalsIgnoreCase("single bed"))) {
                System.out.println("Invalid enter, Please re-enter your room type");
                scan.nextLine();
            }

            price += (roomType.equalsIgnoreCase("king bed")) ? king :
                    (roomType.equalsIgnoreCase("Queen bed")) ? queen : single;

            System.out.println("Your total charges are: $" + price);
            System.out.println("Would you prefer to reserve additional room?");
            String answer = scan.nextLine();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Please re-enter Yes or No");
                answer = scan.nextLine();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for cruising with Celebrity Cruise Lines");
                System.out.println("Your total amount due is $"+price);
                break;
            }
        }
    }
}
