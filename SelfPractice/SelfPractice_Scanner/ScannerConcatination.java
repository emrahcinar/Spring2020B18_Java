package SelfPractice.SelfPractice_Scanner;

import java.util.Scanner;

/*
Ask user to enter two words. Then add them together and print.
                        Input:
                            one
                            eight
                        Output:
                            oneeight
 */
public class ScannerConcatination {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Num1 is: ");
        String num1=scan.next();
        System.out.println("Num2 is: ");
        String num2=scan.next();

        String total=num1+num2;
        System.out.println("Total is: "+total);

    }
}
