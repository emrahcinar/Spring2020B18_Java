package replits;

import java.util.Scanner;

public class replit_85 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            shoppingListReport += ", Item" + count + ": " + item + " Price: " + price;
            count++;
            totalPrice += price;
            System.out.println("Add one more item?");
            countinue = scan.next();
            if (countinue.equalsIgnoreCase("yes")) {
            } else if (countinue.equalsIgnoreCase("No")) {
                shoppingListReport = shoppingListReport.substring(2);
                System.out.println(shoppingListReport + "\nTotal price: " + totalPrice);
                System.exit(0);
            }


        } while (true);


    }
}
