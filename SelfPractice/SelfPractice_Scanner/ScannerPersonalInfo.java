package SelfPractice.SelfPractice_Scanner;

import java.util.Scanner;

public class ScannerPersonalInfo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String fullName=" ";
        String fullAdress=" ";
        String fullContacts=" ";


        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");



        System.out.println("Enter your first name");
       String firstname=scan.next();

        System.out.println("Enter your last name");
        String lastName=scan.next();
        fullName+=lastName+"; ";

        System.out.println("Enter your email");
       String email=scan.next();
        fullContacts+=email+" ";
        scan.nextLine();
        System.out.println("Enter your street");
       String street=scan.nextLine();
       fullAdress+=street+", ";
        System.out.println("Enter your city");
        String city=scan.next();
        fullAdress+=city+", ";
        System.out.println("Enter your state");
       String state=scan.next();
       fullAdress+=state+" ";
        System.out.println("Enter your zip code");
       int zipCode=scan.nextInt();
       fullAdress+=zipCode+" ";
        System.out.println("Enter your work phone number");
        long workPhoneNumber=scan.nextLong();
        fullContacts+=workPhoneNumber+" ";
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber=scan.nextLong();
        fullContacts+=personalPhoneNumber+" ";
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Enter your height");
        double height=scan.nextDouble();
        System.out.println("Enter your weight");
        double weight=scan.nextDouble();
        System.out.println( "Are you married?");
        boolean isMarried=scan.nextBoolean();

        System.out.println("Patient personal information");
        System.out.println("Full name:"+fullName+firstname);
        System.out.println("Address:"+fullAdress);
        System.out.println("Contacts: work phone number - "+workPhoneNumber+", personal phone number - "+personalPhoneNumber+",  email: "+email);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight+" pounds");
        System.out.println("Married?: "+isMarried);













    }
}
