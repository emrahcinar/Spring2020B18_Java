package day14_StringClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
 /*
        userName:cybertek
        passWord:cybertekschool
         */
        String ValidUserName="Cybertek";
        String ValidPassword="Cybertekschool";

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUsername=scan.next();

        System.out.println("Enter your password");
        String inputPAssword=scan.next();

            boolean validCredentials=inputUsername.equals(ValidUserName) &&inputPAssword.equals(ValidPassword);
        if(validCredentials){
            System.out.println("Log in succesfully");
        }else{
            System.out.println("Invalid credentials");
        }




















    }
}
