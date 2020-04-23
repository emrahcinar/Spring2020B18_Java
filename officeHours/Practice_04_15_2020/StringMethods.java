package officeHours.Practice_04_15_2020;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        /*
        String methods:
             toCharArray(): returns char array
                   split(): splits the string by given str, returns string
         */

        String str = "Cybertek";

        char[] ch = str.toCharArray(); //['C','y','b','e','r','t','e','k']

        System.out.println(str.length() == ch.length);//true

/*
str1="abc", str2="cab",

['a','b','c']
['c','b','a']

['a','b','c']
['a','b','c']
 */


        String str1 = "ABC";
        String str2 = "BAC";

        char[] ch1 = str1.toCharArray();//['a','b','c']
        char[] ch2 = str2.toCharArray();//['c','b','a']

        Arrays.sort(ch1);//['a','b','c']
        Arrays.sort(ch2);//['a','b','c']
        System.out.println(Arrays.equals(ch1, ch2));//true
        System.out.println("====================================================================");

        String sentence = "I like to learn java";

        String[] words = sentence.split(" ");//[I, like, to, learn, java, java, java]

        System.out.println(Arrays.toString(words));


        int totalNumWords = words.length;
        System.out.println(totalNumWords);//length is 7
        String result = "";
        //[I, like, to, learn, java, java, java]
        for (int i = words.length - 1; i >= 0; i--) {
            //System.out.print(words[i]+" ");//java learn to like I
            result += words[i] + " ";
        }
        System.out.println(result.trim());


    }
}
