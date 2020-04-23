package SelfPractice.SelfPractice_String;

import java.util.Scanner;

public class EmailAndPassword {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name");
        String user = scan.nextLine().toLowerCase();
        System.out.println("Enter your password");
        String pass = scan.nextLine();
        String username = "cybertek.batch18@gmail.com";
        String password = "Javengers";

        if (user.endsWith("@gmail.com")) {
            if (user.equalsIgnoreCase(username) && pass.equals(password)) {
                System.out.println("Logged in succesfully");
            } else {
                if (!user.equalsIgnoreCase(username) && !pass.equals(password)) {
                    System.out.println("Both username and passords are incorrect");
                }else if(!user.equalsIgnoreCase(username)){
                    System.out.println("Invalid username");
                }else{
                    System.out.println("Invalid password");
                }
            }

        } else {
            System.out.println("It's not a valid mail adress");
        }


    }
}
