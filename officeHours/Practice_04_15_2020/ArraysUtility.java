package officeHours.Practice_04_15_2020;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        /*
        Arrays.sort():sorts to array in Ascending order
        Arrays.equal(arr1,arr2): arr1 == arr2
        Arrays.toString():converts single dimentional array to string

        Arrays.deepToString():
         */

        int[] arr = {9, 10, 8, 65, 8, 6, 5};

        Arrays.sort(arr); //

        System.out.println(Arrays.toString(arr));//[5, 6, 8, 8, 9, 10, 65]



        int[] salaries={10000, 20000, 30, 50000, 432, 123123 , 200000000};
      //  int lenght=salaries.length;
      //  int lastIndex=lenght-1;

        Arrays.sort(salaries); // ascending oreder(smallest to last index)

        System.out.println(Arrays.toString(salaries));
        System.out.println("Minimum salary: "+salaries[0]);
        System.out.println("Maximum salary: "+salaries[salaries.length-1]);

        System.out.println("===================================================================");

        int[]arr1={3,2,1};
        int[]arr2={2,1,3};

        Arrays.sort(arr1);//{1,2,3};
        Arrays.sort(arr2);//{1,2,3};
        System.out.println(Arrays.equals(arr1,arr2));









    }
}
