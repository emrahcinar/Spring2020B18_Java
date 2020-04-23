package replits;

import java.util.Scanner;

/*
Given an int variable n that has already been declared and initialized to a positive value,
 and another int variable j that has already been declared, use a for loop to print a single line
  consisting of n asterisks. Thus if n contains 5, five asterisks will be printed.
  Use no variables other than n and j.
 */
public class replit_97 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countJava = 0;
        int countPhyton = 0;
        boolean result = false;
        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.contains("java")) {
                sentence = sentence.replaceFirst("java", "");
                countJava++;
            }

            if (sentence.contains("python")) {
                sentence = sentence.replaceFirst("python", "");
                countPhyton++;
            }
        }
        if (countJava == countPhyton) {
            System.out.println(!result);

        } else {
            System.out.println(result);
        }


    }
}

