package day18_nestedLoops;

/*
1. write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators
            10/3=3 with reminder of 1

 */
public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        if (b == 0) {

            System.out.println("diviser cannot be zero");
            System.exit(0);
        }


        int count = 0; // count the execution of the loop
        while (a >= b) {
            a -= b;
            count++;
        }
        if (a == 0) {
            System.out.println("The result is " + count);//3}
        } else {
            System.out.println("The result is " + count + " with a reminder of " + a);
        }


    }
}
