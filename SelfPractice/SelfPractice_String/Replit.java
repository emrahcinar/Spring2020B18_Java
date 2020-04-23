package SelfPractice.SelfPractice_String;


import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter item: ");
        String item = scan.nextLine();
        System.out.println("Enter Price: $");
        int price = scan.nextInt();
        int change=100-price;
        if(price<=100){
                if(item.equals("Charger")){
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+change);
                }else if(item.equals("USB cable")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+change);
        }else if(item.equals("Headphones")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+change);
        }else if(item.equals("Pants")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+change);
        }else if(item.equals("Hat")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+change);
        }else if(item.equals("Socks")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+change);
        }else if(item.equals("Blanket")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+change);
        }else if(item.equals("Pillow")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+change);

        }else if (item.equals("Smartphone") || item.equals("Laptop")) {
                    System.out.println("Sorry, not enough funds on your gift card!");
                } else {
                    System.out.println("Invalid item!");
                }
        } else {
            System.out.println("Sorry, not enough funds on your gift card!");
        }























    }
}
