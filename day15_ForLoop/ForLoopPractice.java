package day15_ForLoop;


public class ForLoopPractice {
    public static void main(String[] args) {

        /*
        odd numbers between 1~100 in a single line sperated by a space
        1 3 5 7 9 11........
         */
        String resultOdd = "";
        for (int number = 1; number <= 100; number += 2) {
            // System.out.print(number+ " ");1 3 5 7 9 11........

            resultOdd += number + " ";
        }
        System.out.println(resultOdd);
/*
            Even number between 0~100
            2 4 6 8 10 12 14 16........
 */

        String resultEven = "";

        for (int number=2 ; number <=100 ; number +=2) {

            resultEven += number + " ";
            System.out.print(resultEven);
        }
















    }
}
