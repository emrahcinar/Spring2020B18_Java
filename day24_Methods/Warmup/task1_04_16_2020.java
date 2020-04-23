package day24_Methods.Warmup;

import java.util.Scanner;

public class task1_04_16_2020 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number for KM: ");
        double km=scan.nextDouble();

        KmToMiles(km);
    }

    public static void  KmToMiles(double km ){

        double miles=km*0.612;




        System.out.println(km+" km = "+miles+" miles" );
    }











}
