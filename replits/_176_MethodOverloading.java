package replits;
/*
In this task, you need to write 2 methods findMax() that will find a maximum number
in the array. First method should work with array of integers (int[]) and return int,
 and second method should work with an array of doubles (double[]) and return double as a result.
 Methods must have the same name and different parameters.
Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
Comment: Methods should be non static and with a return type.
 */

import java.util.*;

public class _176_MethodOverloading {
    public static void main(String[] args) {

        double[] arr = {1, 2, 3, 4,5};
        System.out.println(findMax(arr));

    }
    public static int findMax(int[]arr){
        int maxnumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (maxnumber<arr[i]){
                maxnumber=arr[i];
            }
        }
        return maxnumber;
    }
    public static double findMax(double[]arr){
        double maxnumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxnumber<arr[i]){
                maxnumber=arr[i];
            }
        }
        return maxnumber;
    }
}
