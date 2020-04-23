package day18_nestedLoops;

import java.util.Scanner;

/*
write a program that can retunr the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
 */
public class FactorialNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number");
        int num =scan.nextInt();  //5
        int result=1;

        while(num>=1){
        result*=  num;
            num--;
        }
        System.out.println(result);































    }
}
