package day26_MethodOverloading;

import javax.print.DocFlavor;

/*
1. write a return method called frequency that accepts two parameters: string str and char ch,
        the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
    2. use the above method to create another called uniques that accepts a string paramter
    and returns it's unique characters as String
            Ex: uniques("ABBC");      ==> "AC"
 */
public class Frequency {
    public static void main(String[] args) {

        String str = "ABBAAB";
        char ch='A';

      char[]arr=  str.toCharArray(); // [A,A,A]

        int count=0;
        for( char each :arr ){//3 times occur in the string
            if (each==ch){
                count++;
            }
        }
        System.out.println(count);
        String str2="ABDEFAABBBABABABAB";
        char ch2='B';
       int num2=frequency(str2,ch2);
        System.out.println(num2);

    }

    public static int frequency(String str, char ch) {//count the ch's frequency
        char[]arr=  str.toCharArray(); // [A,A,A]

        int count=0;
        for( char each :arr ){//3 times occur in the string
            if (each==ch){ // each:A,B,B
                count++;
            }
        }
        return count;
    }
}