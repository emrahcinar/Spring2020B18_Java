package replits;

import java.util.Scanner;

public class replit_84 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();


int days=0;
for (int i=1; i<=inhabitants; i*=2 ) {
    System.out.println("Day " + days + " [" + (inhabitants / i) + "]");
    days++;
}
    System.out.println("----EXTINCT----");

}



















    }

