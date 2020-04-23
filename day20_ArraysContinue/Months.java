package day20_ArraysContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

    String[] months={"Jan","Feb","March","Apr","May","June","Jul","Aug","Sept","Oct","Nov","Dec"};//size12,maxindex:13
        //                 0     1      2      3     4
        /*
        String[] months2=new String[12];
                months[0]="Jan";
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();

        int attemps=1;
       while  (num>12 || num <=0){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num=input.nextInt();
            attemps++;
            if (attemps==3 && (num>12 || num <=0)){
                System.out.println("Invalid Entry, you already have 3 attemps");
                System.exit(0);
            }
        }
        String result= months[num-1];//index number,index number starts from 0 always
        System.out.println(result);

























    }
}
