package replits;

import java.util.Scanner;

public class replit_144 {
    public static void sign(int n) {
        //your code here
        int result = 0;
        if (n > 0) {
            result = 1;
        } else if (n == 0) {
            result = 0;
        } else {
            result = -1;
        }
        System.out.println(result);

    }//end sign

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);

    }
}
