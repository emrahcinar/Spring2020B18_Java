package day12_Java_Recap;

import java.util.Scanner;

public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter five numbers");

        double num1=scan.nextDouble();
        double num2=scan.nextDouble();
        double num3=scan.nextDouble();
        double num4=scan.nextDouble();
        double num5=scan.nextDouble();

        double sum=0;

        if(num1>0) {
            sum += num1;
        }
        if(num2>0){
            sum+=num2;
        }
        if(num3>0){
            sum+=num3;
        }
        if(num4>0){
            sum+=num4;
        }
        if(num5>0){
            sum+=num5;
        }
        System.out.println("sum of positive numbers are: "+sum);
/*
Assigment:
write a program that ask 5 numbers and prints the number in ascending order
        Ex:
        5,4,1,2,3,
        output:
        1,2,3,4,5,
 */
























    }
}
