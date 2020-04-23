package SelfZz;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1, y1; // A noktası
        double x2, y2; // B noktası

        System.out.print("x1:");
        x1 = scan.nextDouble();

        System.out.print("y1:");
        y1 = scan.nextDouble();

        System.out.print("x2:");
        x2 = scan.nextDouble();

        System.out.print("y2:");
        y2 = scan.nextDouble();

        double m, b; //y = mx+b
        m = (y2-y1) / (x2-x1);

        b = y2 - m * x2;

        System.out.println("y=" + m + "x + (" + b + ")");

        double x, y;
        System.out.print("x:");
        x = scan.nextDouble();

        y = m * x + b;
        System.out.println( "y=" + y); //y=mx+b

        System.out.println("------------------------------------------------------");
        double res;

        System.out.print("x:");
        x = scan.nextDouble();

        System.out.print("y:");
        y = scan.nextDouble();

        res = 5 * Math.pow(x, 3) + 6*y*y - x / (y+1);

        System.out.println(
                "f(" + x + "," + y + ")= "
                        + "5(" + x + ")^3"
                        + "+ 6(" + y + ")^2"
                        + "-" + x + "/(" + y + "+ 1) ="
                        + res);


    }
}













