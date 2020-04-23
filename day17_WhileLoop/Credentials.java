package day17_WhileLoop;

import java.util.Scanner;

/*
user:cybertek
pass:cybertek123
 */
public class Credentials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String username = input.next();

        System.out.println("Enter Pass Word");
        String password = input.next();
        boolean valid = (username.equals("cybertek") && password.equals("cybertek123"));//false
        //   validating the first username and password
        int count = 1;
        while (!valid) {
            System.out.println("Please re enter your credentions");
            System.out.println("Enter user name");
            username = input.next();
            System.out.println("Enter Pass Word");
            password = input.next();
            valid = (username.equals("cybertek") && password.equals("cybertek123"));
            //validating new user name and password
            count++;
                if (count == 3 && !valid) {
                    System.out.println("Your account is locked");
                    break;
            }

        }
        if (valid) {
            System.out.println("Logged in");
        }


    }
}
