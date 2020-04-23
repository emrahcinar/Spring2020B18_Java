package day22_Arrays_Loops;

import java.util.Arrays;

/*
  2. write a program that sort the array in descending order
 */
public class Decending {
    public static void main(String[] args) {
        int[] arr = {10, 78, 2, -1, 500, 70};

        Arrays.sort(arr);//sort in ascending
        System.out.println(Arrays.toString(arr));

        int[] Revarr=new int[arr.length];

        int j=arr.length-1;
        for (int i=0;i<arr.length;i++){
            Revarr[i]=arr[j];
            j--;
        }
        System.out.println(Arrays.toString(Revarr));



































    }
}
