package SelfPractice.SelfPractice_Scanner;

import java.util.Scanner;

        public class ScannerRadiusofCircle {
            public static void main(String[] args) {
                /*
                 1. write a program that can calculate the area of circle
                needed information:
                                    1. radius of the cirle
                 */


                Scanner scan=new Scanner(System.in);
                System.out.println("Enter the radius");
                int radius=scan.nextInt();
                double area=(radius*radius)*3.14;
                System.out.println("Radius of the circle is: "+area);



























    }

}
