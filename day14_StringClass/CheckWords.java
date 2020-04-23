package day14_StringClass;
/*
1. Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
 */
import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first word");
        String word1=scan.next();

        System.out.println("Enter second word");
        String word2=scan.next();

        System.out.println("Enter third word");
        String word3=scan.next();

int lenght1=word1.length();
int lenght2=word2.length();
int lenght3=word3.length();


boolean NotSame=lenght1 !=lenght2 && lenght2 != lenght3 && lenght1 != lenght3;
//              none of them same with eachother
if(lenght1==lenght2&&lenght2==lenght3){
    //if they are same length:      print "All words are same length"
    System.out.println("All words are same lenght");
}else if (NotSame){
    System.out.println();
    System.out.println("All diffrent lenght");
}else{
    System.out.println("Not same nor Different lenghts");
}








































    }
}
