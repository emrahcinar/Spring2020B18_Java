package replits;

import java.util.Scanner;
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to
the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */

public class replit_numberofappearancesofjavapython {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countJava = 0;
        int countPhyton = 0;
        int count = 0;
        boolean result = false;
        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);
            for (int j = 0; j < sentence.length(); i++) {
                char ch1 = sentence.charAt(j);
                if (ch == ch1) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }}
