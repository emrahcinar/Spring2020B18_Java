package day16_ForLoop;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String str = scan.next();
        //   0123
        String result = ""; //ab is the expected result

        for (int i = 0; i <= 3; i++) {// 0 , 1 , 2 , 3
           // for (int i = 0; i <=str.length()-1; i++) till the end of the String
            /*
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
             }

             */
            if (result.contains("" + str.charAt(i))) {
                continue;
            }
                result += str.charAt(i);

        }

        System.out.println(result);


    }
}
