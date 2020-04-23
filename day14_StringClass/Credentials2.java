package day14_StringClass;

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {

        /* Valid credentials are:
        username:Cybertek
        password:cybertekschool

        precondition: username and password cannot be empty
                      if they are empty==>please enter the credentials
        if user entered both valid username and password ==>log in
        if valid password, invalid username==> username is incorrect
        if valid use name ,invalid password==> password is incorrect
        if both password and username re invalid==>invalid username and password
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUsername = input.nextLine();

        System.out.println("Enter your password");
        String inputPassWord = input.nextLine();


        boolean logedIn = inputUsername.equals("Cybertek") && inputPassWord.equals("cybertekschool");
        // user entered both valid username and password

        boolean InvalidUserName = !inputUsername.equals("Cybertek") && inputPassWord.equals("cybertekschool");
        // user entered invalid username and valid password

        boolean InvalidPassWord = inputUsername.equals("Cybertek") && !inputPassWord.equals("cybertekschool");
        // username is valid, but password is invalid

        if (!inputUsername.isEmpty() && !inputPassWord.isEmpty()) {  // username and passowrd are not empty

            if (logedIn) {
                System.out.println("Logged in");
            } else if (InvalidUserName) {
                System.out.println("Password is correct, username is incorrect");
            } else if (InvalidPassWord) {
                System.out.println("Username is correct, password is incorrect");
            } else {
                System.out.println("Both username and password are incorrect");
            }


        } else { // username and passowrd are empty
            System.out.println(" please enter the credentials");
        }

    }}



