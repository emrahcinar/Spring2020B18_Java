package SelfPractice.SelfPractice_Scanner;

import java.util.Scanner;

public class ScannerVehicle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter vehicle brand: ");
        String brand=scan.next();
        System.out.println("Enter vehicle year: ");
        int year=scan.nextInt();
        System.out.println("Enter Vehicle model");
        double model=scan.nextDouble();
        System.out.println("Enter Vehicle mile: ");
       long mile=scan.nextLong();
        System.out.println("Enter Vehicle colour: ");
        String colour=scan.next();

        System.out.println("Your vehicle brand is "+brand+"\n year is "+year+"\n model is "+model+"\n mile is "+mile+"\n colour is "+colour);











    }
}
