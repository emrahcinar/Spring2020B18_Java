package SelfPractice.SelfPractice_Scanner;

import java.util.Scanner;

public class ScannerStudentScore {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Score: ");
        byte score=scan.nextByte();

         String result=(score>=90)?"Passed with Distinction":(score>=60&&score<=90)?"Pass":"Fail";
        System.out.println(result);


































    }
}
