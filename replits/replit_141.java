package replits;

import java.util.Scanner;

/*
Given method called cube. Write all required code inside this method in order
 to asks the user for a number and then prints the cubed value of that number:
Example:
input: 5
output: 125
hint: cube of a number n = n*n*n
 */
public class replit_141 {

        public static void cube()
        {
            //your code here
            Scanner scan=new Scanner(System.in);
            int number=scan.nextInt();

            int a=number*number*number;
            System.out.println(a);
        }//end cube

        public static void main(String[] args) {

            cube();

        }
    }





















