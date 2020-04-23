package day16_ForLoop;

import java.util.Scanner;

/*
7. write a program that can calculate the sum of all numbers between 1 to any given number
		ex:
			input: 100
			output: 5050
			input: 50
			output: 1275
			input : 200
			output : 20100
 */
public class CalculateSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();  // 100
        int sum = 0;//1+2+3 ... +100
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);






































    }
            }
