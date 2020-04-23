package SelfZ;

import java.util.Scanner;

public class Ders1 {
    public static void main(String[] args) {
        //* primitive variable type
        //Z -> byte, short, int, long,
        //R -> float, double
        //char -> ASCII, UniCode, UTF8
        //boolean

        //digitise -> (1010)2 = (9)2

        //*Reference type
        //Any object
        //string

        //Definition
        String firm;
        String product;

        double price;
        double quantity;
        double subTotal, total;
        double tax;
        double taxRatio = 0.1;

        Scanner sc = new Scanner(System.in);
        //Input

        System.out.print("Firm=");
        firm = sc.nextLine();

        System.out.println("Product-----");
        System.out.print("Name=");
        product = sc.nextLine();

        System.out.print("Price=");
        //Left (place)  <-  right (value after computation)
        price = sc.nextDouble();
        System.out.print("Quantity=");
        quantity = sc.nextDouble();

        //Computation
        subTotal = price*quantity;
        tax = subTotal*taxRatio;
        total = subTotal + tax;

        System.out.println("\n\n\n");
        //Output
        System.out.println("Emrah Toptan A.Ş.");
        System.out.println("-------------------------");
        System.out.println("Müşteri:" + firm);
        System.out.println("Ürün:" + product);
        System.out.println("Fiyat:" + price + "TL");
        System.out.println("Miktar:" + quantity + "kg");
        System.out.println("-------------------------");
        System.out.println("Ara toplam:" + subTotal+ "TL");
        System.out.println("Vergi:" + tax+ "TL");
        System.out.println("Toplam:" + total+ "TL");
        System.out.println("-------------------------");

    }
}
