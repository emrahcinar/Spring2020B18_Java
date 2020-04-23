package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_utilities {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};


        String r = Arrays.toString(arr);
        System.out.println(r);

        System.out.println(arr); //array must be convertesto string before we print

        String names[] = {"medina", "Fatih", "Osman"};

        System.out.println(Arrays.toString(names));

        double[] nums = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0] + 1);
        System.out.println("==========================================================");


        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8,};

        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] += arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[arr.length+j] += arr2[j];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
