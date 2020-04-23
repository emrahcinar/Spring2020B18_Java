package replits;
import java.util.*;

import static java.lang.System.out;

/*
Given a String array words, iterate through each word and print first and
 last letter of each element in separate lines.
 words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
 */
public class replit_101 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};



                for (int i=0;i<=4;i++){
                    System.out.println(""+words[i].charAt(0)+words[i].charAt(words[i].length()-1));
                 }



























    }
}
