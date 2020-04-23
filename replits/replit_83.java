package replits;

import java.util.Scanner;

public class replit_83 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String guests="";
        while (true) {
            System.out.println("Please enter guest name:");
            String name = input.next();
            System.out.println("Do you want to enter new guest name:");
            String answer = input.next();
            while  (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Please re-enter Yes or No");
                answer = input.next();
            }
            guests+=name+", ";

            if (answer.equalsIgnoreCase("no")) {
                guests=guests.substring(0,guests.length()-2);
                System.out.print("Guest's list: "+guests);

                System.exit(0);
            }
        }


























































    }
}
