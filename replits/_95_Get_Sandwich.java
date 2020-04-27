package replits;

import java.util.Scanner;

/*
A sandwich is two pieces of bread with something in between.
 Print the string that is between the first and last appearance
 of "bread" in the given string, or return string "nothing" if
 there are not two pieces of bread.
 Example:
input: breadjambread
output: jam
Example:
input: xxbreadjambreadyy
output: jam
Example:
input: xxbreadapple
output: nothing
Example:
input: breadbutterbread
output: butter
 */
public class _95_Get_Sndwich {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if (str.contains("bread")) {
            str = str.substring(str.indexOf("bread") + 5, str.length());

        }
        if (str.contains("bread")) {
            str = str.substring(0, str.lastIndexOf("bread"));
            System.out.println(str);
        }else{
        System.out.println("nothing");


    }
}}
