package day19_Arrays;

import java.util.Scanner;

public class Arrays_Practice2 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        System.out.println(arr.length); //3


        int[] arr2 = new int[5];
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        String[] Testers = new String[3];  //{"Reem","Medina","Osman"}
        //index: 0 , 1 , 2

        Testers[0] = "Reem";
        Testers[2] = "Osman";
        Testers[1] = "Madina";
        System.out.println(Testers[0]);//Reem
        System.out.println(Testers[1]);//null
        System.out.println(Testers[2]);//Osman

        System.out.println(Testers.length);//3

        System.out.println("========================================================================");

        Scanner scan = new Scanner(System.in);

        String[] student = new String[10];
        //Write a program that aska "enter a name" 10 times, and store each of the names in the array students
        for (int i = 0; i <= student.length - 1; i++) {
            System.out.println("Enter name");
            student[i] = scan.next();
        }
        System.out.println("List of student: ");
        for (int i = 0; i <= student.length - 1; i++) {
            System.out.println((i + 1) + "." + student[i]);
        }

        System.out.println("========================================================================");
        String[] months=new String[12];
        for (int i=0; i<=months.length-1;i++){
            System.out.println("Enter months");
            months[i]=scan.next();
        }
        System.out.println("List of months");
        for (int i=0;i<=months.length-1;i++){
            System.out.println((i+1)+"."+months[i]);
        }


        System.out.println("========================================================================");


        String days[] = new String[7];

        for (int i = 0; i <= days.length - 1; i++) {
            System.out.println("Week Days");
            days[i] = scan.next();
        }
        for (int i = 0; i <= days.length - 1; i++) {
            System.out.println((i + 1) + "." + days[i]);
        }


    }
}
