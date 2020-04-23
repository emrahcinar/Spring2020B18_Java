package replits;

/*
This method gets a string and returns the word count of that string.
example:
wordCount("foo bar")
returns 2
wordCount("one two three")
returns 3
wordCount("bla")
returns 1
hint:
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
 */

import java.util.Arrays;

public class replit_169 {
    public static void main(String[] args) {
        int a=wordCount("ahmet");
        System.out.println(a);

    }
    public static int wordCount(String words) {

      /*  int result = 0;

        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);
            if (words.charAt(i)==' '){
                result++;
            }
            }
            return result+1;
       */

       String[]arr=words.split(" ");
        System.out.println(Arrays.toString(arr));
        return arr.length;


    }
}
