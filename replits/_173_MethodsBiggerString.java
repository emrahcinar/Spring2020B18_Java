package replits;

/*
 the method gets two strings and return the longest one
 biggerS("apple","orange") ==> "orange"
 */
public class _173_MethodsBiggerString {
    public static void main(String[] args) {

        System.out.println(biggerS("izmir","istanbul"));

    }

    public static String biggerS(String a, String b) {


        if (a.length() > b.length()) {
            return a;
        } else {
            return b;
        }


    }
}
