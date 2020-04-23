package replits;

import java.util.*;

public class replit_114 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int count = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            count = 0;
            for (int j = 0; j <= nums.length - 1; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count != 2) {
                System.out.println(nums[i]);
            }
        }
    }
}




































