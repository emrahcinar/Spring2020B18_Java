package SelfPractice.SelfPractice_Scanner;

import java.util.Scanner;

public class ScannerAdress {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String fulladres=" ";

        System.out.println("Enter your apt. number: ");
        Short aptNumber=scan.nextShort();
        fulladres+=aptNumber+" ";

        System.out.println("Enter your street name: ");
        String street=scan.next();
        fulladres+=street+" ";

        System.out.println("Enter your route name: ");
        String route=scan.next();
        fulladres+=route+" ";

        System.out.println("Enter your city and state name");
        String city=scan.next();
        fulladres+=city+" ";
        String state=scan.next();
        fulladres+=state+", ";

        System.out.println("Enter your Zipcode: ");
        int zip=scan.nextInt();
        fulladres+=zip+" ";

        System.out.println("Adress is: "+fulladres);






    }
}
