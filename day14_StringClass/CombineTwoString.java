package day14_StringClass;

import java.util.Scanner;

/*
1. Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
 */
public class CombineTwoString {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first word");
        String word1=scan.next();

        System.out.println("Enter second word");
        String word2=scan.next();

String result=word1.concat(" "+word2).concat(" "+word2).concat(" "+word1);
        System.out.println(result);
















































    }
}

