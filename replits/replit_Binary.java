package replits;

import java.util.Scanner;

public class replit_Binary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }

        //TODO: Write your code below.

        int n=128;
        int result=0;
        for (int dec:binary){
            result+=(dec*n);
            n=n/2;
        }
        System.out.println(result);
    }
}