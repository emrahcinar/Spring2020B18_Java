package day27_DateTime;

/*
1. write a return method that can return the minimum number from an int array
		2. write a return method that can return the minimum number from a double array
					NOTE: apply method overloading,  DO NOT USE SORT METHOD.
 */
public class Find_minimum {
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 5};//4
        int minimum = arr[0];
        for (int each : arr) {
            if (each < minimum) {
                minimum = each;
            }
        }
        System.out.println(minimum);

        int[] arr2 = {100, 2000, 3000, 40, 50, -100, -9000};
        int min = minimum(arr2);
        System.out.println(min);
        double[]arr3={55.,10.5,1.5,2.5,};
        double num1=  minimum(arr3);
        System.out.println(num1);
    }

    public static int minimum(int[] arr) {
        int minimum = arr[0];
        for (int each : arr) {
            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;
    }

    public static double minimum(double[] arr){

        double minimum = arr[0];
        for (double each : arr) {
            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;
    }



    }


