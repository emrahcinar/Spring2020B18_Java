package SelfPractice.SelfPractice_Scanner;


import java.util.Scanner;
/*
        brand
        year
        price
        model
        miles
         */
public class ScannerSumofNumbers {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println();
        int num1=scan.nextInt();
        System.out.println();
        int num2=scan.nextInt();
        System.out.println();
        int num3=scan.nextInt();
        int ValueOfSum=scan.nextInt(num1+num2+num3);
        System.out.println("Sum of numbers: "+ValueOfSum);











    }


}
