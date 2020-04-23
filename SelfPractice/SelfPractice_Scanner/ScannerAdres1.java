package SelfPractice.SelfPractice_Scanner;

import java.util.Scanner;
/*
6301A Wedgewood Corner Dr Atlanta, GA 30084
 */
public class ScannerAdres1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter Apt. Number: ");
     String aptNumber=scan.nextLine();
        System.out.println("Enter Street name: ");
        String streetName=scan.nextLine();
        System.out.println("Enter route name:  ");
        String routeName=scan.next();
        scan.nextLine();
        System.out.println("Enter city name and state name: ");
        String cityStateName=scan.nextLine();
        System.out.println("Enter Zipcode: ");
        int zipCode=scan.nextInt();

        System.out.println("Full adress is : "+aptNumber+" "+streetName+" "+routeName+" "+cityStateName+" "+zipCode);













    }
}
