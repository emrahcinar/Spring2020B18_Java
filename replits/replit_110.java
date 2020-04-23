package replits;

import java.util.Scanner;

public class replit_110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int countEvenNumber = 0;

        for (int each : nums){
            if (each%2==0){
                countEvenNumber++;
                continue;
            }

        }

        System.out.println(countEvenNumber);
    }
}
