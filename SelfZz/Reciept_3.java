package SelfZz;

import java.util.Scanner;

public class Reciept_3 {
    public static void main(String[] args) {

        String item, name;
        double price, tax, total, quantitiy;
        double taxRate = 0.12;
        double discount = 0;
        double subTotal = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("=WELCOME TO BESTBUY=");
        System.out.println("Enter customer name");
        name = scan.next();
        System.out.println("Please Enter item name");
        item = scan.next();
        System.out.println("Please Enter Price");
        price = scan.nextDouble();
        System.out.println("Item Quantitiy");
        quantitiy = scan.nextDouble();


        subTotal = price * quantitiy;

        if (subTotal > 1000) {
            discount = subTotal * 0.15;
        }else if (subTotal>800){
            discount=subTotal*0.7;
        }

        double discountedSubTotal=subTotal-discount;

        tax = discountedSubTotal * taxRate;

        total = discountedSubTotal + tax;


        System.out.println("^^^^^BEST BUY^^^^^^");
        System.out.println(".......................................................");
        System.out.println("Customer Name : " + name);
        System.out.println("Produrct :" +item);
        System.out.println("Price : $"+price);
        System.out.println("Quantitiy : "+(int)quantitiy);
        System.out.println(".......................................................");
        System.out.println("SubTotal after Discount: $" + discountedSubTotal);
        System.out.println("Discount: $" + discount);
        System.out.println("Tax : $" + tax);
        System.out.println("Total : $" + total);
        System.out.println("===============Thanks For Shopping==================== ");
    }
}
