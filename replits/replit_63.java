package replits;

import java.util.Scanner;

public class replit_63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();


        String str = word1.concat(word2.concat(word2.concat(word1)));
        System.out.println(str);


    }
}
