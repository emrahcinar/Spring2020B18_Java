package SelfZz;

import java.util.Scanner;

public class FahrenheitCelcius {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double sub;
        double celcius;
        System.out.println("Enter Fahrenheit please:");
        double fahrenheit;
        fahrenheit = scan.nextDouble();

        sub = fahrenheit - 32;
        celcius = sub * 5 / 9;
        System.out.println(fahrenheit + " fahrenheit is = " + celcius + " celcius");
    }
}
