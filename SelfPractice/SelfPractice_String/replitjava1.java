package SelfPractice.SelfPractice_String;

import java.util.Scanner;

public class replitjava1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter full name");
        String name=scan.nextLine();
        boolean names=name.equalsIgnoreCase("Max Payne")||name.equalsIgnoreCase( "Alan Wake");
        if(names){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }





    }
}