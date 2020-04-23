package SelfZz;

import java.util.Scanner;

public class Reciept_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String firm;
        String item;
        double quantitiy;
        double price;
        double subTotal;
        double taxRate=0.01;
        double tax;
        double total;

        System.out.println("Enter Firm Name: ");
        firm=scan.nextLine();
        System.out.println("Enter item: ");
        item=scan.nextLine();
        System.out.println("Enter miles: ");
        quantitiy=scan.nextDouble();
        System.out.println("Enter Rate per mile: ");
        price=scan.nextDouble();

        subTotal=quantitiy*price;
        tax=subTotal*taxRate;
        total=tax+subTotal;

        System.out.println("Firm name is: "+firm);
        System.out.println("-------------------");
        System.out.println("Enter item: "+item);
        System.out.println("Enter quantity: "+quantitiy+" miles");
        System.out.println("Enter price: $"+price+" per mile");
        System.out.println("-------------------");
        System.out.println("SubTotal is: "+subTotal);
        System.out.println("Tax: "+tax);
        System.out.println("-------------------");
        System.out.println("Total Price: $"+total);
        System.out.println("====Thank You====");



























































    }
}
