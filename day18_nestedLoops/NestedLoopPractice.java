package day18_nestedLoops;

public class NestedLoopPractice {
    public static void main(String[] args) {

        for (int j = 0; j < 5; j++) {
            for (int i = 1; i <= 5; i++) {

                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("===================================================================================");
        /*
         ******
         ******
         ******
         ******
         ******
         ******
         ******
         */
        for (int i = 0; i < 7; i++) { //outter loop repeating the inner loop over and over again

            int a = 1;
            while (a <= 6) {
                System.out.print("*");
                a++;
            }
            System.out.println();
        }


    }  }

