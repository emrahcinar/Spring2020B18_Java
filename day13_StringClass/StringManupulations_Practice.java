package day13_StringClass;

import java.util.Scanner;

/*
input: cyBerTek sChool
output:  Cybertek
         School
 */
public class StringManupulations_Practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName=scan.nextLine();    //cybertek school

        String firstName=fullName.substring(0,fullName.indexOf(" "));
        String lastName=fullName.substring(fullName.indexOf(" ")+1);


        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println("Your first name is"+firstName);
        System.out.println("Your last name is"+lastName);


/*
Assigment:
write program that ask the user first and last names, then prints initials.
ex:
input: cybertek
        school
        output:
        CS
 */























    }

}
