package day26_MethodOverloading;

import java.util.Arrays;

public class MethodOverLoading2 {
    /*
    first method: print sum of two numbers
    second method: print the sum of three numbers
    third method: print the sum four number
     */
    public static void main(String[] args) {
        //10 ,5
        sum2Numbers(10, 5);
        //10,5,15
        sum3Numbers(10, 5, 15);
        //10,20,30,5
        sum4Numbers(10, 20, 30, 5);

        System.out.println("==================================================================================");

        //10,5
        sum(10, 5);

        //15,10,5
        sum(15, 10, 5);

        //10,20,30,5
        sum(10,20,30,5);


int[] arr1={3,2,1};
char[] arr2={'z','s','a'};
double[] arr3={7.4,6,5,20.6};

Arrays.sort(arr1);
Arrays.sort(arr2);
Arrays.sort(arr3);// same method name , diffrent parameter


    }

    public static void sum2Numbers(int a, int b) {
        System.out.println(a + b);

    }

    public static void sum3Numbers(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void sum4Numbers(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
    //==================================================================================

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
    /*

     */


}
