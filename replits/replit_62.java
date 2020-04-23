package replits;

import java.util.Scanner;

public class replit_62 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();

       word = word.charAt(0) + word.substring(word.length() - 1);
        System.out.println(word);


    }
}
