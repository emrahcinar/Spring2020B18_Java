package SelfZz;

import java.util.Scanner;

public class ifProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Grade");
        int gradets = scan.nextInt();

        if (gradets >= 91 && gradets<=100) {
            System.out.println("A");
        } else if (gradets <= 90 && gradets>=80) {
            System.out.println("B");
        } else if (gradets <= 79 && gradets>=70) {
            System.out.println("C");
        } else if (gradets <= 69 && gradets>=60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }


    }
}
