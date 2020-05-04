package day24_Methods.Warmup;
import java.util.Arrays;
/*
4. creata a function that can print the maximum number from any given array
	5. creata a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
 */
public class MinMaxNumber {
    public static void MaxNumber(int[] array) {

        Arrays.sort(array);//ascending order
        System.out.println("Max number is: " + array[array.length - 1]);

    }

    public static void MinNumber(int[] array) {

        Arrays.sort(array);//ascending order
        System.out.println("Min number is: " + array[0]);

    }

    public static void Descending(int[]array){  //{100,200,-100}

        Arrays.sort(array);

        for (int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        MaxNumber(arr);//10
        MinNumber(arr);//1

        int[] arr1 = {100, 90, 80, 70, 60, -50, -40, 3, 2, 1};
        MaxNumber(arr1);//10
        MinNumber(arr1);//-50

Descending(arr1);

    }
}
