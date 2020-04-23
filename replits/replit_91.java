package replits;
/*
Print out the number of times that the string "hi" appears anywhere in the given string.
Example:
input: abc hi how hi
output: 2

Example:
input: hi code java please
output: 1

 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class replit_91 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count=0;

        for (int i=0; i<str.length()-1;i++){
            if(str.substring(i,i+2).equalsIgnoreCase("hi"))
                count=count+1;
            }
            System.out.print(count);


        System.out.println("================================================================");



/*
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int count =0;

        while(str.contains("hi")){
            str=  str.replaceFirst("hi","");
            count++;
        }
        System.out.println(count);


 */








    }
























    }

