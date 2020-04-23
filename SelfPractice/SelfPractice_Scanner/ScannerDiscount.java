package SelfPractice.SelfPractice_Scanner;

import java.util.Scanner;

public class ScannerDiscount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Price: ");
        int price = scan.nextInt();

        System.out.println("Quantitiy: ");
        int quantitiy = scan.nextInt();

        int total = price * quantitiy;
        System.out.println("Total Price is: " + total);

        double disc = 0;
        if (total >= 5000) {
            disc = total * 0.10;
            System.out.println("Discount amount is: " + disc);
        }
        double net = total - disc;
            System.out.println("Net revenue: " + net);



    }
}
