package day12_Java_Recap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //7925 JonesBranch Dr , McLean VA, 22034
        // fullAdress: Building-number Street,city,state zipcode

        System.out.println("Building number: ");
       String Bnumber= scan.next();  //7925+Enter

        scan.nextLine();// used for taking out the Enter from scanner

        System.out.println("Street: ");
        String street=scan.nextLine();



        System.out.println("Enter the zip code: " );
        int zipCode=scan.nextInt();//22034+Enter

        scan.nextLine(); // teke out the enter

        System.out.println("enter the city name and state seperated by comma and space");

        String cityState=scan.nextLine();

        String fulladress=Bnumber+" "+street+", \n"+cityState+" "+zipCode;

        System.out.println(fulladress);






















    }
}
