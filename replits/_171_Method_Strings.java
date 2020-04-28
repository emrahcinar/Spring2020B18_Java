package replits;

import java.util.Scanner;

/*
 This method gets a string and an int, it returns a string.
what it dose is limit the inputted string to a cretin number of characters.
for example:
limit("abcd",2)
returns "ab"
limit("bla bla",3)
returns "bla"
 */
public class _171_Method_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entera word");
        String scan=sc.next();
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println(limit(scan,num));

    }
    public static String limit(String text, int maxLength) {

return text.substring(0,maxLength);



    }
}
