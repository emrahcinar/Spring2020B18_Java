package SelfPractice.SelfPractice_Scanner;

import java.util.Scanner;

public class ScannerShoppingList {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        String item1=scan.next();
        int count1=scan.nextInt();
        double price1=scan.nextDouble();
        String report="";
        String report1="";
        System.out.println("Enter Item2, count and its price:");
        String item2=scan.next();
        int count2=scan.nextInt();
        double price2=scan.nextDouble();
        String report2="";

        System.out.println("Enter Item3, count and its price:");
        String item3=scan.next();
        int count3=scan.nextInt();
        double price3=scan.nextDouble();
        String report3="";

        double item1Price= price1*count1;
        double item2Price= price2*count2;
        double item3Price= price3*count3;
        double totalPrice=item1Price+item2Price+item3Price;
        if(count1>0){
            report1="Item1: "+item1+" Price: "+item1Price;
        }
        if(count2>0){
            report2=", Item2: "+item2+" Price: "+item2Price;
        }
        if(count3>0){
            report3=", Item3: "+item3+" Price: "+item3Price;
        }
        report=report1+report2+report3;
        System.out.println(report);
        System.out.println("Total price: "+totalPrice);
    }
}
