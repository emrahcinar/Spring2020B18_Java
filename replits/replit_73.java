package replits;

import java.util.Scanner;
/*
scott_forstall@apple.com
First name: Scott
Last name: Forstall
Domain: apple
Top-Level Domain: com
 */

public class replit_73 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = scan.next();

        String firstName=email.substring(0,email.indexOf("_"));
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        String Top_levelDomain=email.substring(email.indexOf(".")+1);

        System.out.println("First name: "+firstName+"\nLast name: "+lastName+"\nDomain: "
                +domain+"\nTop-Level Domain: "+Top_levelDomain);










    }
}
