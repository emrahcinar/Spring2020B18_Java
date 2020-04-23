package day12_Java_Recap;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in); //13 +Enter

        System.out.println("Enter some number");
        int num=scan.nextInt();//13
        System.out.println(num);

        scan.nextLine();  //Enter    //used taking out the Enter
        System.out.println("Enter your name");
        String name=scan.nextLine();


        System.out.println(name);






























    }
}
