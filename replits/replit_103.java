package replits;

import java.util.Arrays;
import java.util.*;

/*
Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();

    String reversed = "";
 */
public class replit_103 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        String reversed = "";
        String s[] = sentence.split(" ");
Arrays.toString(s);
        for (int i = s.length - 1; i >= 0; i--) {
String each =s[i];
            reversed +=" "+each;
            reversed=reversed.trim();
        }
        System.out.println(reversed);


    }
}
