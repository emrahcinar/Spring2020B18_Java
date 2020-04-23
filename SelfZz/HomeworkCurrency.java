package SelfZz;

import java.util.Scanner;

public class HomeworkCurrency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double avro;
        double dollar;
        double sterlin;
        double lira;
        System.out.println("------------------------------------");
        System.out.println("1 Avro = ");
        avro = scan.nextDouble();
        System.out.println("1 Dollar = ");
        dollar = scan.nextDouble();
        System.out.println("1 Sterlin = ");
        sterlin = scan.nextDouble();
        System.out.println("How much do you want to convert?");
        lira = scan.nextDouble();


        avro = lira / avro;
        System.out.println(lira + " Lira " + avro + " Avro ");
        System.out.println("------------------------------------");


        dollar = lira / dollar;
        System.out.println(lira + " Amerikan Dolar'i " + dollar + " Dolar'dir.");
        System.out.println("------------------------------------");


        sterlin = lira / sterlin;
        System.out.println(lira + " Ingiliz Sterlin'i " + sterlin + " Sterlin'dir.");
        System.out.println("------------------------------------");
        System.out.println("===========================================================");


    }


}
