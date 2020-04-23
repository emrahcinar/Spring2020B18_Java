package replits;

import java.util.Scanner;

public class replit_72 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_"))
        {
            String a = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            String b = email.substring(0, email.indexOf("_"));
            String c = a+"_"+b+"@gmail.com";
            System.out.println(c);
        }
        else
        {
            System.out.println(email);
        }


















    }
}
