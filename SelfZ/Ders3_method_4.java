package SelfZ;

import java.util.Scanner;

public class Ders3_method_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.print("a:");
        a=sc.nextInt();

        System.out.print("b:");
        b=sc.nextInt();

        System.out.print("c:");
        c=sc.nextInt();

        int max;

        if (a>b){
            if(a>c){
                max=a;
            }
            else {
                max=c;
            }
        }
        else { //a<=b kesin, %100

            if (b>c){
                max=b;
            }else {
                max = c;
            }

        }

        System.out.println("Max:" + max);
    }
}
