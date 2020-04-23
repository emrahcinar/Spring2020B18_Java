package SelfZz;

import java.util.Scanner;

public class Reciept {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String firm;
        String product;
        double quantitiy;
        double productPrice;
        double subTotal;
        double taxRate = 0.1;
        double tax;
        double total;


        System.out.println("Firm: ");
        firm=scan.nextLine();

        System.out.println("Enter item: ");
        product = scan.nextLine();
        System.out.println("Enter quantitiy: ");
        quantitiy = scan.nextDouble();
        System.out.println("Enter price: ");
        productPrice = scan.nextDouble();


        subTotal=quantitiy*productPrice;
        tax=taxRate*subTotal;
        total=subTotal+tax;
        System.out.println("-------------");
        System.out.println("Firm name is: "+firm);
        System.out.println("-------------");
        System.out.println("Product is: "+product);
        System.out.println("Price is: "+productPrice);
        System.out.println("Quantitiy is: "+quantitiy);
        System.out.println("-------------");
        System.out.println("SubTotal is: "+subTotal);
        System.out.println("Tax is: "+tax);
        System.out.println("Total price is: "+total);
















    }
}
