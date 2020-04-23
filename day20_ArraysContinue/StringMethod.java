package day20_ArraysContinue;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

        String name = "Emrah";
        char[] characters = name.toCharArray();

        System.out.println(Arrays.toString(characters));

        String str1 = "Cybertek School";
        String str2 = "School Cybertek";

        char[] ch1 = str1.toCharArray();//[C, y, b, e, r, t, e, k,  , S, c, h, o, o, l]
        char[] ch2 = str2.toCharArray();//[S, c, h, o, o, l,  , C, e, y, b, e, r, t, e, k]
        Arrays.sort(ch1);
        Arrays.sort(ch2);
boolean equalstr=Arrays.equals(ch1,ch2);

        System.out.println(equalstr);

    }
}
