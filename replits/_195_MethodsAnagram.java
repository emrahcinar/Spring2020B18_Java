package replits;

import day07_Ifstatements.If_Else_Statements;

import java.util.ArrayList;
import java.util.Arrays;

public class _195_MethodsAnagram {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        System.out.println(isAnagram(word1, word2));

    }

    public static boolean isAnagram(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            return true;
        } else {
            return false;
        }


    }

}
