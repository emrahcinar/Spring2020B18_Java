package SelfPractice.SelfPractice_Loop;

import java.util.Scanner;

public class LoopPractice4 {
    public static void main(String[] args) {
        int i=10;
        while(i>0){
            System.out.println("java "+i);
            i--;
        }
        System.out.println("Loops done "+i);


        System.out.println("====================================================");
        Scanner scan=new Scanner(System.in);

int num=scan.nextInt();

int factoriel=1;
while(num>=1){
factoriel=factoriel*num;
    System.out.println("Factoriel " + factoriel+" number"+ num);


    num--;
}

        System.out.println("Factoriel " + factoriel);




















      


    }
}
