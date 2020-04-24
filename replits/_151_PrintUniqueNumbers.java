package replits;
import java.util.*;
public class _151_PrintUniqueNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE

        for (int each : nums) {      //for(int j=0; j<arr.length;j++)

            int count2 = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == (each)) {
                    count2++;
                }
            }
            if (count2 == 1) {
                System.out.println(each);
            }
        }
    }}
