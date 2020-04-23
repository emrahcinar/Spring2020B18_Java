package day24_Methods;

import Resources.Library;


import java.util.Arrays;


public class Test {


    public static void main(String[] args) {

        String str = "Muhtar";


        String RevStr = Library.Reverse(str);


        System.out.println(RevStr);


        int[] arr = {5, 9, 10, 3, 2, -1};


        arr = Library.sortDesending(arr);


        System.out.println(Arrays.toString(arr));


    }


}