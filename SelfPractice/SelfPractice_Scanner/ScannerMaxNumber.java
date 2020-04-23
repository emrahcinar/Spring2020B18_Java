package SelfPractice.SelfPractice_Scanner;

import java.util.*;

public class ScannerMaxNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter num1");
        double n1=scan.nextDouble();

        System.out.println("Enter num2");
        double n2=scan.nextDouble();

        System.out.println("Enter num3");
        double n3=scan.nextDouble();

        double Largest=(n1>n2&&n1>n3)?n1
                :(n2>n1&&n2>n3)?n2
                :n3;

        System.out.println("Largest number is: "+Largest);


















    }
}
